
import java.lang.annotation.*;
/**
 * Description:
 * <br>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2001-2020, Yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 5.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
// ����Testableע�⽫��javadoc������ȡ
@Documented
public @interface Testable
{
}