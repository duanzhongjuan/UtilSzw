package SQLUtil.method;

/**
 * @描述： 查询语句封装
 * @类名路径： com.api.SQLUtil.method SelectSql
 * @作者： 宋志伟
 * @创建时间：2020/7/31 12:15
 */
public class SelectSql{
    public static final String NULL = " ";//定义空字符
    public static String jieshou = "";//接收拼接sql语句
    static String[] sqlSelect = {"select","from","where","group by"};//定义数据库关键字数组,查询的关键字数组
    //更改装载SQL关键字段值
    public static void setSqlSelect(String[] sqlSelect) {
        SelectSql.sqlSelect = sqlSelect;
        System.out.println("加载值成功!");
    }

    /**
     * @描述: 组装sql语句,关键字分别是查询的列名,表名,where条件和分组查询
     */
    public static String select(String... params){
        //判断传参是否正确,传过来的参数是否合法
        if(params.length <= sqlSelect.length) {
            //循环拼接sql语句
            for (int i = 0; i < params.length; i++) {
                //if判断插入的字符串是否为null或者"",是的话不进行拼接
                if (params[i] != "" && params[i] != null) {
                    //实际拼接sql语句,如果不为空就拼接sql语句
                    jieshou += sqlSelect[i] + NULL + params[i] + NULL;
                }
                System.out.println("执行了:"+(i+1)+"次");
            }
        }else {
            return "没有更多装载值";//返回一个报错信息,这里表示传进来的参数过多,然而sql语句关键值不能接收那么多字段
        }
        //在这里减去拼接后最后一个字符串,最后一个字符串为 " "
        jieshou = jieshou.substring(0,jieshou.length()-1);
        return jieshou;//返回一个值就是sql语句
    }
}
