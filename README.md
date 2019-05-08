# Web_test_git
基于webdriver的自动化测试工具
https://github.com/oiuy-888/Web_test_git/blob/master/web自动化结构.png

程序执行入口为example.Test1类的run()方法。

1.在config中自定义button并添加默认测试数据，需要修改的数据则在web.xml文件中变更，不同版本适配时通过变更此文件达到目的；

2.在exampl/Test1中实现用例执行逻辑的控制；

3.在mudule下Actuate中包装基本操作方法，其他类中完成测试用例脚本的编辑与拼接；

4.在testsuit中添加测试用例case，实现对用例方法的调用并输出用例名称等必要日志便于测试报告记录；

5.在ui中通过javax.swing添加操作接面（必要性不高）
