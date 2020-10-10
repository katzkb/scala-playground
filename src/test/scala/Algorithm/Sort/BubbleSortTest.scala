package Algorithm.Sort
import org.scalatest.DiagrammedAssertions

class BubbleSortTest extends org.scalatest.FunSuite with DiagrammedAssertions {
  test("pattern1: 321") {
    assert(Vector(1, 2, 3) === BubbleSort.bubbleSort(Vector(3,2,1)))
  }

  test("pattern1: 123") {
    assert(Vector(1, 2, 3) === BubbleSort.bubbleSort(Vector(1,2,3)))
  }

  test("pattern1: 692743851") {
    assert(Vector(1, 2, 3, 4, 5, 6, 7, 8, 9) === BubbleSort.bubbleSort(Vector(6, 9, 2, 7, 4, 3, 8, 5, 1)))
  }
}
