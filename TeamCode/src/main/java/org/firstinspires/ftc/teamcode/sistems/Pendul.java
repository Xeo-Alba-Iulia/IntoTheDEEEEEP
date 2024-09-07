package org.firstinspires.ftc.teamcode.sistems;

import com.qualcomm.robotcore.hardware.DcMotorEx;

public class Pendul {
    DcMotorEx pendul;

    public Pendul(DcMotorEx pendul){
        this.pendul = pendul;
    }

    public void setTargetPosition(int position){
        pendul.setTargetPosition(position);
    }
    public double getCurrentPosition() {
        return pendul.getCurrentPosition();
    }
}
