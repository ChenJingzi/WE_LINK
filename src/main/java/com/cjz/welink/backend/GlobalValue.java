package com.cjz.welink.backend;

public class GlobalValue {
    public final static String teamsCannelUrl="https://outlook.office.com/webhook/e375c8b7-d15d-45bb-984e-9117127a75eb@37155b7b-4b0e-488c-b3fe-e84c1d1b7f85/IncomingWebhook/d26ea2d3423a48e7896d54b1015cda91/b6ea3b12-2186-42e9-9952-6a320631135a";

    public final static String teamsCannelBody=
            "{" +
                "\"@type\": \"MessageCard\",\"@context\": \"https://schema.org/extensions\",\"summary\": \"This is the summary property\",\"themeColor\": \"000000\",\"sections\":"+
                "["+
                     "{" +
                         "\"heroImage\": " +
                        "{"+
                              "\"image\":\"https://messagecardplayground.azurewebsites.net/assets/FlowLogo.png\""+
                         "}"+
                     "},"+
                    "{" +
                        "\"startGroup\": true,"+
                        "\"title\": \"**告警消息**\","+
                        "\"facts\": " +
                        "["+
                            "{"+
                                "\"name\": \"IP地址:\","+
                                "\"value\": \"192.168.1.1\""+
                            "},"+
                            "{"+
                                "\"name\": \"时间:\","+
                                "\"value\": \"2019.07.13 15:58:31\""+
                             "},"+
                            "{"+
                                "\"name\": \"报错信息:\","+
                                "\"value\": \"Uncaught Error Class Memcached not found in Memcachedchen.class.php:20\""+
                            "},"+

                            "{"+
                                "\"name\": \"报错信息321:\","+
                                "\"value\": \"Uncaught Error Class Memcached not found in Memcachedchen.class.php:20\""+
                            "},"+

                            "{"+
                                "\"name\": \"链接1:\","+
                                "\"value\": \"[查看更多报错信息1](https://www.baidu.com)\""+
                            "}"+
                        "]"+
                    "},"+
                    "{"+
                        "\"potentialAction\":"+
                         "["+
//                             "{"+
//                                "\"@type\": \"ActionCard\","+
//                                "\"name\": \"点击处理\","+
//                                "\"inputs\":"+
//                                "["+
//                                    "{"+
//                                        "\"@type\": \"TextInput\","+
//                                        "\"id\": \"comment\","+
//                                        "\"isMultiline\": true,"+
//                                        "\"title\": \"备注\""+
//                                    "}"+
//                                "],"+
//                                "\"actions\":"+
//                                "["+
//                                    "{"+
//                                        "\"@type\": \"HttpPOST\","+
//                                        "\"name\": \"保存\"," +
//                                        "\"target\": \"http://...\""+
//                                    "}"+
//                                "]"+
//                            "},"+
                            "{"+
                                "\"@type\": \"ActionCard\","+
                                "\"name\": \"取消\","+
                                "\"inputs\": "+
                                "["+
                                    "{"+
                                        "\"@type\": \"TextInput\"," +
                                        "\"id\": \"comment\"," +
                                        "\"isMultiline\": true," +
                                        "\"title\": \"取消原因\"" +
                                    "}"+
                                "],"+
                                "\"actions\": "+
                                "["+
                                    "{" +
                                         "\"@type\": \"HttpPOST\"," +
                                         "\"name\": \"保存\"," +
                                         "\"target\": \"http://...\"" +
                                    "}"+
                                "]"+
                            "}"+
                         "]"+
                    "},"+
                    "{"+
                        "\"startGroup\": true,"+
                        "\"activitySubtitle\": \"Grant approvals directly from your mobile device with the Microsoft Flow app. [Learn more](https://learnmode)\\n\\nThis message was created by an automated workflow in Microsoft Flow. Do not reply.\""+
                    "}"+
                "]"+
            "}";

}
