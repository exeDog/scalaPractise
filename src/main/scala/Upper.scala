Class Upper {
  def upper(args: Array[String]) : Seq[String] =
    {
      strings.map((s:String) => s.toUpperCase())
    }
}

val up = new Upper
println(up.upper("scala","priyank","rege"))
