package org.firstinspires.ftc.teamcode.opmodes.teleop;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.RobotHardware;

@TeleOp(name = "Kickathon")
public class Kickathon extends OpMode {
    RobotHardware robot = new RobotHardware(this);

    enum HookState{
        OPEN,
        CLOSE
    }

    HookState currentState = HookState.OPEN;

    @Override
    public void init() {
        robot.init();
    }

    public void lift(){
        double lPower = 0;
        if (gamepad2.dpad_up){ lPower = 1; } else if (gamepad2.dpad_down) { lPower = -1; }
        robot.lift.setPower(lPower);
    }
    public void pendul(){
        robot.pendul.setPower(gamepad2.right_stick_y);
    }
    public void hook(){
        switch (currentState){
            case OPEN:
                if (gamepad2.cross) {
                    currentState = HookState.CLOSE;
                }
                robot.hook.setPosition(0);
            case CLOSE:
                if (gamepad2.cross) {
                    currentState = HookState.OPEN;
                }
                robot.hook.setPosition(0.35);
        }


    }

    @Override
    public void loop() {
        robot.movement(gamepad1);
        lift();
        pendul();
        hook();
    }
}
