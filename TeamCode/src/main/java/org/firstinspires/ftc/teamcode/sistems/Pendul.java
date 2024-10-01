package org.firstinspires.ftc.teamcode.sistems;

import com.qualcomm.robotcore.hardware.DcMotorEx;

public class Pendul {
    static DcMotorEx pendulL;
    static DcMotorEx pendulR;

    public int target;

    public Pendul(DcMotorEx pendulL, DcMotorEx pendulR) {
        this.pendulL = pendulL;
        this.pendulR = pendulR;
        target = 0;
    }
    public static void setPower(double power) {
        pendulL.setPower(power);
        pendulR.setPower(-power);
    }
}
