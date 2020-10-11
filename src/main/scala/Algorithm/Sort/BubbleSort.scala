package Algorithm.Sort

object BubbleSort {

  /**
   * Sort Vector[Int] by Bubble-Sort
   * @param vec Target int-vector
   * @return
   */
  def bubbleSort(vec: Vector[Int]): Vector[Int] = {

    /**
     * Sort vector
     * @param vec Target int-vector
     * @param cnt Number of swaps required
     * @param res result vector
     */
    @scala.annotation.tailrec
    def f(
      vec: Vector[Int],
      cnt: Int,
      res: Vector[Int] = Vector.empty[Int]
    ): Vector[Int] = {
      vec match {
        case init :+ last2 :+ last1 if cnt > 0 =>
          val l = swap((last2, last1))
          f(init :+ l._1, cnt, l._2 +: res)
        case _ => vec.last +: res
      }
    }

    val size = vec.length
    vec.indices.foldLeft(vec)((z, n) => f(z, size - n))
  }

  /**
   * Swap number as asc order
   * @param pair target numbers for swap
   * @return     swapped int tuple
   */
  private def swap(pair: (Int, Int)): (Int, Int) =
    if (pair._1 > pair._2) pair.swap else pair
}
