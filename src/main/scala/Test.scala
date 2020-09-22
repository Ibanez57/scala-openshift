object Test extends App {
	println("========")
	println("= Test =")
	println("========")

	// To prevent Openshift from restarting the pod indefinitely
	while (true) Thread.sleep(10000)
}