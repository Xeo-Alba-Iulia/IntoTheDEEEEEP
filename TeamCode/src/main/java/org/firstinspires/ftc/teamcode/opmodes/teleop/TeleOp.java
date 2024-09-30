package org.firstinspires.ftc.teamcode.opmodes.teleop;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.RobotHardware;
import org.firstinspires.ftc.teamcode.sistems.Pendul;

@com.qualcomm.robotcore.eventloop.opmode.TeleOp(name = "Kickathon")
public class TeleOp extends OpMode {
    RobotHardware robot = new RobotHardware(this);

    @Override
    public void init() {
        robot.init();
    }

    public void lift(){
        Pendul.setPower(gamepad1.right_stick_y);
    }

    @Override
    public void loop() {
        robot.movement(gamepad1);
        lift();
    }
}