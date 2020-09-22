import akka.actor.ActorSystem


object Test extends App {
	println("========")
	println("= Test =")
	println("========")

	implicit val system: ActorSystem = ActorSystem("Test")

	// To prevent Openshift from restarting the pod indefinitely
	//while (true) Thread.sleep(10000)
}