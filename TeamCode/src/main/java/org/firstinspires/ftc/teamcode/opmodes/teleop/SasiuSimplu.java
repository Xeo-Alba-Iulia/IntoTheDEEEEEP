package org.firstinspires.ftc.teamcode.opmodes.teleop;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.RobotHardware;

@TeleOp(name = "SasiuSimplu", group = "A")

public class SasiuSimplu extends OpMode {

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
