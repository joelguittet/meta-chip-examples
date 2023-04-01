meta-chip-example-spidev
==

NextThingCo C.H.I.P. Yocto meta layer example SPIDEV.

This layer contains SPIDEV example for the NextThingCo C.H.I.P. boards.

This layer depends on the additional layers:
* meta-yocto
* meta-yocto-bsp
* meta-openembedded/meta-oe
* meta-openembedded/meta-python
* meta-openembedded/meta-networking
* meta-chip (from my GitHub https://github.com/joelguittet/meta-chip)


Images
--

The following images are available:
* chip-image-example-spidev: image with spitools from https://github.com/cpb-/spi-tools to test SPI interface.

The wanted image is chosen during the build with bitbake command.


Using
--

Clone sources:

	git clone https://github.com/joelguittet/meta-chip-examples.git ~/yocto/meta-chip-examples

Add "meta-chip-examples/meta-chip-example-spidev" to the bitbake layers configuration file.

See the README file of the meta-chip layer (from my GitHub https://github.com/joelguittet/meta-chip) to check details about building and flashing images on the C.H.I.P. board.

### chip-image-example-spidev

After flashing the image, the interface is available at "/dev/spidev2.0".

The spi-tools can be used to test the SPI interface.

Checking the SPI interface configuration:

	spi-config -d /dev/spidev2.0 -q # Will output current mode, lsb, bits and speed configuration of the interface

See https://github.com/cpb-/spi-tools to check details and usage of spi-tools.


Contributing
--

All contributions are welcome :-)

Use Github Issues to report anomalies or to propose enhancements (labels are available to clearly identify what you are writing) and Pull Requests to submit modifications.


References
--

* https://github.com/joelguittet/meta-chip
* https://github.com/cpb-/spi-tools
