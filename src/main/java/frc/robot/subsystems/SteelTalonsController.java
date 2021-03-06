package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

public class SteelTalonsController extends WPI_VictorSPX {
    
    private boolean reverse;
    private double bias;

    public SteelTalonsController(int deviceNumber, boolean reverse, double bias)
    {
        super(deviceNumber);
        this.reverse = reverse;
        this.bias = bias;
        setInverted(reverse);
    }

    @Override
    public void set(double speed)
    {
        super.set(speed * bias);
    }


}
