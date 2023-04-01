meta-chip-example-linux-rt
==

NextThingCo C.H.I.P. Yocto meta layer example Linux-RT.

This layer contains Linux-RT example for the NextThingCo C.H.I.P. boards.

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
* chip-image-example-linux-rt: image with Linux-RT kernel patched.

The wanted image is chosen during the build with bitbake command.


Using
--

Clone sources:

	git clone https://github.com/joelguittet/meta-chip-examples.git ~/yocto/meta-chip-examples

Add "meta-chip-examples/meta-chip-example-linux-rt" to the bitbake layers configuration file.

See the README file of the meta-chip layer (from my GitHub https://github.com/joelguittet/meta-chip) to check details about building and flashing images on the C.H.I.P. board.

### chip-image-example-linux-rt

After flashing the image on the C.H.I.P. board, several testing can be performed to evaluate the performances of the kernel. Below are results for cyclictest and hackbench for C.H.I.P. and C.H.I.P. PRO:

```
root@chip:~# cyclictest --smp -p98 -m
# /dev/cpu_dma_latency set to 0us
WARN: Running on unknown kernel version...YMMV
policy: fifo: loadavg: 0.01 0.01 0.00 1/73 358

T: 0 (  358) P:98 I:1000 C: 212972 Min:      9 Act:   13 Avg:   14 Max:      35
```

```
root@chip:~# hackbench
Running in process mode with 10 groups using 40 file descriptors each (== 400 tasks)
Each sender will pass 100 messages of 100 bytes
Time: 4.905
```

```
root@chip-pro:~# cyclictest --smp -p98 -m
# /dev/cpu_dma_latency set to 0us
WARN: Running on unknown kernel version...YMMV
policy: fifo: loadavg: 0.00 0.00 0.00 1/70 362

T: 0 (  362) P:98 I:1000 C: 211314 Min:      8 Act:   11 Avg:   11 Max:      34
```

```
root@chip-pro:~# hackbench
Running in process mode with 10 groups using 40 file descriptors each (== 400 tasks)
Each sender will pass 100 messages of 100 bytes
Time: 4.434
```

Some GPIO testing has also been performed with a C application toggling a single GPIO. Maximal frequency measured was only about 8.33kHz with Linux-RT vs about 6.25kHz without Linux-RT.


Contributing
--

All contributions are welcome :-)

Use Github Issues to report anomalies or to propose enhancements (labels are available to clearly identify what you are writing) and Pull Requests to submit modifications.


References
--

* https://github.com/joelguittet/meta-chip
* https://rt.wiki.kernel.org
