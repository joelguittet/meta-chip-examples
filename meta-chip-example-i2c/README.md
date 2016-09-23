meta-chip-example-i2c
==

NextThingCo C.H.I.P. Yocto meta layer example I2C.

This layer contains I2C example for the NextThingCo C.H.I.P. board.

This layer depends on the additional layers:
* meta-yocto
* meta-yocto-bsp
* meta-openembedded/meta-oe
* meta-openembedded/meta-python
* meta-openembedded/meta-networking
* meta-chip (from my GitHub https://github.com/myfreescalewebpage/meta-chip)


Images
--

The following images are available:
* chip-image-example-i2c: image with i2c-tools to test I2C interface.

The wanted image is chosen during the build with bitbake command.


Using
--

Clone sources:

	git clone https://github.com/myfreescalewebpage/meta-chip-examples.git ~/yocto/meta-chip-examples

Add "meta-chip-examples/meta-chip-example-i2c" to the bitbake layers configuration file.

See the README file of the meta-chip layer (from my GitHub https://github.com/myfreescalewebpage/meta-chip) to check details about building and flashing images on the C.H.I.P. board.

### chip-image-example-i2c

After flashing the image, the i2c-tools can be used to test the I2C interfaces.

Checking the I2C device presence is done with i2cdetect:

	i2cdetect 0 # Will detect device AXP209 available on the baord at address 0x34
	i2cdetect 1 # Will detect devices connected to C.H.I.P. on this bus, if any
	i2cdetect 2 # Will detect device PCF8574 available on the board at address 0x38

AXP209 and PCF8574 will be detected on buses 0 and 2. However, they are busy and it is not possible read/write their registers. The tools "i2cget" and "i2cset" can be used with your own devices.


Contributing
--

All contributions are welcome :-)

Use Github Issues to report anomalies or to propose enhancements (labels are available to clearly identify what you are writing) and Pull Requests to submit modifications.


References
--

* https://github.com/myfreescalewebpage/meta-chip
* https://github.com/cpb-/spi-tools
