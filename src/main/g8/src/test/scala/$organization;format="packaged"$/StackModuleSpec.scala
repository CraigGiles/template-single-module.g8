package $organization$

import org.scalatest.{Matchers, WordSpecLike}

abstract class TestCase extends WordSpecLike
  with Matchers

class StackModuleSpec extends TestCase with StackModule {
  "A stack" should {
    "push a value" in {
      val empty = List.empty[Int]
      val (state, _) = push(empty, 1)
      state should be(List(1))
    }
  }
}
