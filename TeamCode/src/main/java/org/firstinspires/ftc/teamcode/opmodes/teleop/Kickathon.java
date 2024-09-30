package org.firstinspires.ftc.teamcode.opmodes.teleop;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.RobotHardware;

@TeleOp(name = "Kickathon")
public class Kickathon extends OpMode {
    RobotHardware robot = new RobotHardware(this);

    @Override
    public void init() {
        robot.init();
    }

    public void lift(){
        robot.liftL.setPower(gamepad1.right_stick_y);
    }

    @Override
    public void loop() {
        robot.movement(gamepad1);
        lift();
    }
}