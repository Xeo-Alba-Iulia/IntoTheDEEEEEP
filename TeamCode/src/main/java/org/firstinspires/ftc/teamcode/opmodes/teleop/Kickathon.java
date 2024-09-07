package org.firstinspires.ftc.teamcode.opmodes.teleop;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.RobotHardware;

public class Kickathon extends OpMode {
    RobotHardware robot = new RobotHardware(this);
    @Override
    public void init() {
        robot.init();
    }

    @Override
    public void loop() {
        robot.movement(gamepad1);
    }
}
