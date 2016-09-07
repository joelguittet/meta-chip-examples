meta-chip-example-1wire
==

NextThingCo C.H.I.P. Yocto meta layer example 1-Wire.

This layer contains 1-Wire example for the NextThingCo C.H.I.P. board.

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
* chip-image-example-1wire: image with 1-Wire master interface set on PD2 pin and all 1-Wire slaves support added to the kernel.

The wanted image is chosen during the build with bitbake command.


Using
--

Clone sources:

	git clone https://github.com/myfreescalewebpage/meta-chip-examples.git ~/yocto/meta-chip-examples

Add "meta-chip-example/meta-chip-example-1wire" to the bitbake layers configuration file.

See the README file of the meta-chip layer (from my GitHub https://github.com/myfreescalewebpage/meta-chip) to check details about building and flashing images on the C.H.I.P. board.

Once the C.H.I.P. has been flashed, the 1-Wire interface is available in "/sys/bus/w1". The wiring is typicaly the following:
* GND pin of the 1-wire device to GND of C.H.I.P.
* VCC pin of the 1-wire device to +3.3V of C.H.I.P.
* DQ pin of the 1-wire device to PD2 (LCD-D2) of C.H.I.P.
There is no need for pull-up on the DQ line (it is set internally). Multiple 1-wire devices can be connected together.

To test the 1-wire interface, connect a DS18B20 sensor to C.H.I.P. and read the current temperature typing:

	cat /sys/bus/w1/devices/28-*/w1_slave

The result will look like the example below (temperature is 28.5°C):

	c8 01 ff 00 1f ff 1f 10 83 : crc=83 YES
	c8 01 ff 00 1f ff 1f 10 83 t=28500


Contributing
--

All contributions are welcome :-)

Use Github Issues to report anomalies or to propose enhancements (labels are available to clearly identify what you are writing) and Pull Requests to submit modifications.


References
--

* https://github.com/myfreescalewebpage/meta-chip
