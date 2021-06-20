import static org.junit.Assert.fail;

import com.rits.cloning.Cloner;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Aspect_Template {

  public Object advice(ProceedingJoinPoint jp) throws Throwable {
    String output =
        "Triggered aspect: " + this.getClass().getName() + " (" + jp.getSourceLocation() + ")";
    Object target = jp.getTarget();
    Object[] args = jp.getArgs();
    Object clonedTarget = new Cloner().deepClone(target);
    Object result = jp.proceed(args);
    if (equivalenceHolds(result, target, clonedTarget, args)) {
      System.err.println(output + " -> Success: Expected equivalence holds");
    } else {
      fail(output + " -> Failure: Expected equivalence DOES NOT hold");
    }
    return result;
  }

  private boolean equivalenceHolds(
      Object result, Object target, Object clonedTarget, Object[] args) {}

  private void snippetWrapper(Object clonedTarget, Object[] args) {}
}
