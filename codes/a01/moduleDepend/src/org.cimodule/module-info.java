

/**
 * Description:<br>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a><br>
 * Copyright (C), 2001-2020, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com<br>
 * @version 5.0
 */
module org.cimodule
{
//	exports org.crazyit.user;
	exports org.crazyit.user to org.fkmodule;
//	opens org.crazyit.shop;
	opens org.crazyit.shop to org.fkmodule;
}
