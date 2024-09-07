package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.Servo;

public class RobotHardware {

    public final OpMode myOpMode;

    public DcMotorEx frontLeft;
    public DcMotorEx frontRight;
    public DcMotorEx backLeft;
    public DcMotorEx backRight;

    public DcMotorEx pendul;

    public DcMotorEx lift;

    public Servo hook;

    public RobotHardware(OpMode opmode) {myOpMode = opmode;}

    public final int pendulNeutral = 0;
    public final int pendulIntake = -1000;
    public final int pendulOuttake = 500;


    public void init() {

        frontLeft = myOpMode.hardwareMap.get(DcMotorEx.class, "MotorFrontLeft");
        frontRight = myOpMode.hardwareMap.get(DcMotorEx.class, "MotorFrontRight");
        backLeft = myOpMode.hardwareMap.get(DcMotorEx.class, "MotorBackLeft");
        backRight = myOpMode.hardwareMap.get(DcMotorEx.class, "MotorBackRight");

        pendul = myOpMode.hardwareMap.get(DcMotorEx.class, "MotorPendul");
        lift = myOpMode.hardwareMap.get(DcMotorEx.class, "MotorLift");

        hook = myOpMode.hardwareMap.get(Servo.class, "ServoHook");

        pendul.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        pendul.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        lift.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        lift.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }
    public void movement(Gamepad gamepad1){

        double y = -gamepad1.left_stick_y;
        double x = gamepad1.left_stick_x * 1.1;
        double rx = gamepad1.right_stick_x;

        double denominator = Math.max(Math.abs(y) + Math.abs(x) + Math.abs(rx), 1);
        double frontLeftPower = (-y - x - rx) / denominator;
        double backLeftPower = (-y + x - rx) / denominator;
        double frontRightPower = (y - x - rx) / denominator;
        double backRightPower = (y + x - rx) / denominator;


        frontLeft.setPower(frontLeftPower);
        backLeft.setPower(backLeftPower);
        frontRight.setPower(frontRightPower);
        backRight.setPower(backRightPower);

    }
}
