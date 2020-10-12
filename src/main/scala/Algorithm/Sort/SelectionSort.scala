package Algorithm.Sort

object SelectionSort {

  /**
   * Sort Vector[Int] by Selection-Sort
   *
   * @param vec Target int-Array
   * @return
   */
  def selectionSort(vec: Vector[Int]): Vector[Int] = {
    val vecMap: Seq[(Int, Int)] = vec.zipWithIndex
    def f(remain: Vector[(Int, Int)], res: Vector[Int]): Vector[Int] = {
      remain match {
        case (headNum, headKey) +: tail =>
          val (minNum, minKey) = tail.minBy(_._1)
          if (headNum > minNum) {
            f(tail, res :+ minNum)
          }
      }
    }
  }
}
