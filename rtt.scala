import scala.io.Source
case class L(r: Float, seq: Long) {
    def this(o: Array[String]) = this(o[0].toFloat, o[1].toLong)
}
val s = Source.fromFile("RTT.txt")
val ls = s.getLines.toSeq.tail.map(l => {
    l.split(",")
})
println(ls(0))
s.close()
