DROP DATABASE IF EXISTS db_assistant ;
CREATE DATABASE db_assistant;

/** 用户表 */
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `account` varchar(20) NOT NULL COMMENT '账户',
  `password` varchar(35) NOT NULL COMMENT '密码',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `data_status` tinyint(4) DEFAULT NULL COMMENT '数据状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8

/** 创建超级管理员记录*/
INSERT INTO t_user(account,PASSWORD,create_time) VALUES('root','a56f038b9b8cb156e4fec68a08a4f41a',NOW())