package org.szhao.actor

import java.util.concurrent.atomic.AtomicReference

/**
 * @author zsh
 *         created 27/Aug/2020
 *          fp in scala
 *         https://www.youtube.com/watch?v=9XAx279s7gs
 *         https://www.slideshare.net/23derevo/nonblocking-michaelscott-queue-algorithm
 *         https://www.youtube.com/watch?v=-gCmiv1_ASg
 */

class Node[E] (var e: E, var next: AtomicReference[Node[E]])

class LinkedQueue[E] {

  val dummy = new Node[E](null.asInstanceOf[E], null)
  val head = new AtomicReference(dummy)
  val tail = new AtomicReference(dummy)

  def put(item: E): Unit = ???
  def poll(): E = ???

}