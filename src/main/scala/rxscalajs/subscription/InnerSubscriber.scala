package rxscalajs.subscription

import scala.scalajs.js



@js.native
class InnerSubscriber[T, R] protected() extends Subscriber[R] {
  def this(parent: OuterSubscriber[T, R], outerValue: T, outerIndex: Double) = this()


}


