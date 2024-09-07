package org.firstinspires.ftc.teamcode.sistems;

import com.qualcomm.robotcore.hardware.DcMotorEx;

public class Lift {
    DcMotorEx lift;

    public static final int POS_1 = 0; // Shortest position
    public static final int POS_2 = 0; // Intake position
    public static final int POS_3 = 0; // Outtake basket position
    public static final int POS_4 = 0; // Outtake clip low position
    public static final int POS_5 = 0; // Outtake clip high position
    public static final int POS_6 = 0; // Hanging position

    public int target;

    public Lift (DcMotorEx lift) {
        this.lift = lift;
        target = 0;
        }
}
