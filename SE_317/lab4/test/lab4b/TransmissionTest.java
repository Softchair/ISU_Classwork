package lab4b;

import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
public class TransmissionTest {

    Transmission transmission;
    Car car;

    @Before
    public void setup() {
        car = new Car();
        transmission = new Transmission(car);

    }

    @Test
    public void remainsInDriveAfterAcceleration()
    {
        transmission.shift(Gear.DRIVE);
        car.accelerateTo(35);

        assertThat(transmission.getGear(),equalTo(Gear.DRIVE));
    }
    @Test
    public void ignoresShiftToParkWhileInDrive()
    {
        transmission.shift(Gear.DRIVE);
        car.accelerateTo(30);
        transmission.shift(Gear.PARK); assertThat(transmission.getGear(),equalTo(Gear.DRIVE));
    }
    @Test
    public void allowsShiftToParkWhenNotMoving()
    {
        transmission.shift(Gear.DRIVE);
        car.accelerateTo(30);
        car.brakeToStop();
        transmission.shift(Gear.PARK);
        assertThat(transmission.getGear(), equalTo(Gear.PARK));
    }


}
