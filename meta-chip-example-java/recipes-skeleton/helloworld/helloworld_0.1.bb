SUMMARY = "JAVA HelloWorld example"
SECTION = "examples"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit java-library

DEPENDS_${PN} = "openjdk-7-jre"
RDEPENDS_${PN} = "openjdk-7-jre"

PR = "r0"

SRC_URI = " \
  file://HelloWorld.java \
  file://manifest \
"

S = "${WORKDIR}"

export JAVA_HOME="${STAGING_DIR_NATIVE}/usr/lib/jvm/icedtea7-native"

do_compile () {
  mkdir -p build
  ${JAVA_HOME}/bin/javac -sourcepath . -d build `find . -name "*.java"`
  ${JAVA_HOME}/bin/jar cfm helloworld-${PV}.jar manifest -C build .
}

do_install_append () {
  install -d ${D}/usr/local/java
  install -m 0644 ${WORKDIR}/helloworld-${PV}.jar ${D}/usr/local/java/helloworld.jar
}

FILES_${PN} = " \
  /usr/local/java/helloworld.jar \
"
