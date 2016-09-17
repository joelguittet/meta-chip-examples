package dio.gpio;

import jdk.dio.*;
import jdk.dio.gpio.*;
import java.io.IOException;

public class gpio {

	public static void main(String[] args) {

		/* Check arguments */
		if ((args.length != 1) || (args[0].length() < 3)) {
			System.out.println("Expecting pin as arguement");
			System.exit(0);
		}

		/* Convert to port and pin */
		char port = args[0].toUpperCase().charAt(1);
		int number = Integer.valueOf(args[0].substring(2), 10).intValue();
		if ((port < 'A') || (port > 'Z') || (number < 0) || (number > 32)) { 
			System.out.println("Impossible to decode pin port and number");
			System.exit(0);
		}
		
		/* Compute pin number: 32 * (port - 'A') + pin */
		int pinNumber = 32 * (port - 'A') + number;

		/* Start blinking */
		System.out.println("Blinking LED on GPIO pin number " + pinNumber + " (" + args[0] + ")");

		GPIOPin pin = null;

		try {

			GPIOPinConfig pinConfig = new GPIOPinConfig(DeviceConfig.DEFAULT, pinNumber, GPIOPinConfig.DIR_OUTPUT_ONLY, GPIOPinConfig.MODE_OUTPUT_PUSH_PULL, GPIOPinConfig.TRIGGER_NONE, false);
			pin = (GPIOPin)DeviceManager.open(GPIOPin.class, pinConfig);

			boolean pinOn = false;
			for (int i = 0; i < 20; i++) {
				Thread.sleep(1000);
				pinOn = !pinOn;
				pin.setValue(pinOn);
			}

		} catch (IOException ioe) {

			System.out.println("IOException while opening device. Make sure you have the appropriate operating system permission to access GPIO devices");

		} catch(InterruptedException ie) {

			System.out.println("InterruptedException while blinking the LED");

		} finally {

			try {

				System.out.println("Closing GPIO pin number " + pinNumber + " (" + args[0] + ")");
				if (pin != null) pin.close();

			} catch (Exception e) {

			System.out.println("Received exception while trying to close device");
			}
		}
	}
}
