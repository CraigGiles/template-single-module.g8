package $organization$

trait StackModule {
  type Stack = List[Int]

  def push(state: Stack, a: Int): (Stack, Unit)
  def pop(state: Stack): (Stack, Option[Int])
}

object Stack extends StackModule {
  def push(state: Stack, a: Int): (Stack, Unit) = (a :: state, ())

  def pop(state: Stack): (Stack, Option[Int]) = state match {
    case x :: xs => (xs, Some(x))
    case Nil => (List.empty[Int], None)
  }
}
