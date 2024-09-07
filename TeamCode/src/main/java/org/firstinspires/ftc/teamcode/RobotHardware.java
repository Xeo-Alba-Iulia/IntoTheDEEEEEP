package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.Gamepad;

public class RobotHardware {

    public final OpMode myOpMode;

    public DcMotorEx frontLeft;
    public DcMotorEx frontRight;
    public DcMotorEx backLeft;
    public DcMotorEx backRight;
    public RobotHardware(OpMode opmode) {myOpMode = opmode;}


    public void init() {

        frontLeft = myOpMode.hardwareMap.get(DcMotorEx.class, "MotorFrontLeft");
        frontRight = myOpMode.hardwareMap.get(DcMotorEx.class, "MotorFrontRight");
        backLeft = myOpMode.hardwareMap.get(DcMotorEx.class, "MotorBackLeft");
        backRight = myOpMode.hardwareMap.get(DcMotorEx.class, "MotorBackRight");
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
