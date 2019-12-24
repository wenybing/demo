#密码加密
1、执行测试类生成密码方法
2、使用命令生成
java -cp jasypt-1.9.3.jar org.jasypt.intf.cli.JasyptPBEStringEncryptionCLI  input="123456" password=EbfYkitulv73I2p0mXI50JMXoaxZTKJ7 algorithm=PBEWithMD5AndDES

其中，input 要加密的明文

password 进行加密操作的密钥

algorithm 使用的加密算法

![密码加密.png]