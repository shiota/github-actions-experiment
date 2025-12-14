package com.springboot.experiment.runner;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.ApplicationArguments;

class BatchApplicationRunnerTest {

  @Nested
  class RunMethod {
    @Test
    void test() throws Exception {
      var runner = new BatchApplicationRunner();
      var args = Mockito.mock(ApplicationArguments.class);

      runner.run(args);
      // ログ出力の検証は難しいため、例外が発生しないことを確認
    }
  }
}
