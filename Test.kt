package src

import io.mockk.mockk
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class Test {

  val mockClass = mockk<ToMock>()

  @Test
  fun runTest() {
  }
}

class ToMock {
}
