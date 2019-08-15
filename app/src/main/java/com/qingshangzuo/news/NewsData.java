package com.qingshangzuo.news;

import java.util.List;

public class NewsData{

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }


    public static class ResultBean {
        /**
         * stat : 1
         * data : [{"uniquekey":"39d0b8f28bf81bed286d712b217ba13d","title":"《等着我》第四季创新\u201c三台合一\u201d新传播模式","date":"2018-05-17 08:04","category":"娱乐","author_name":"国际在线","url":"http://mini.eastday.com/mobile/180517080444165.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20180517/20180517080444_3646f64d1bc75af5f410ea26025fb6ef_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20180517/20180517080444_7eb021518b7814df6d17c45a5d33a2f3_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20180517/20180517080444_ce546607e1d5c0573101f704c5b2be5d_4_mwpm_03200403.jpg"},{"uniquekey":"6024a25e79724152477a722b2f089c86","title":"当浦东题材成为热词，什么样的笔触能够描绘好这方热土？这位土生土长的浦东人有话说","date":"2018-05-17 08:05","category":"娱乐","author_name":"解放网","url":"http://mini.eastday.com/mobile/180517080515322.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20180517/20180517080515_784bacf6981eb30969cea59c8e69e9e4_1_mwpm_03200403.jpg"},{"uniquekey":"7e84572eca8b667ced6d6c06d1a0d5b8","title":"美女明星王晓晨高清写真图集，张张可做壁纸，时尚气质迷人风采！","date":"2018-05-17 08:01","category":"娱乐","author_name":"第一新闻网","url":"http://mini.eastday.com/mobile/180517080159629.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20180517/20180517080159_3feb3b7d0ca65291f382e7fda908f157_8_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20180517/20180517080159_3feb3b7d0ca65291f382e7fda908f157_6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20180517/20180517080159_3feb3b7d0ca65291f382e7fda908f157_11_mwpm_03200403.jpg"},{"uniquekey":"e0c7dfe3a105b4714e52177140e17030","title":"泰版范冰冰戛纳亮相霸气十足～网友：女神永远是女神哈～","date":"2018-05-17 08:01","category":"娱乐","author_name":"扒扒贵圈","url":"http://mini.eastday.com/mobile/180517080159146.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20180517/20180517080159_045eb86dbd7365b1fda89d132c7df99c_6_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20180517/20180517080159_045eb86dbd7365b1fda89d132c7df99c_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20180517/20180517080159_045eb86dbd7365b1fda89d132c7df99c_5_mwpm_03200403.jpg"},{"uniquekey":"b2959f84e1e32a3ee14cfc409f66705e","title":"周星驰《食神》其实很经典，但这个穿帮镜头，让经典不再完美","date":"2018-05-17 08:00","category":"娱乐","author_name":"一论电影","url":"http://mini.eastday.com/mobile/180517080017459.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20180517/20180517_327d7e193ce94a24b1368f7e80feec1f_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20180517/20180517_22f5949ab7819388634f480ea151a586_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20180517/20180517_33f4eec65a8a40f5c3f311718018a50a_mwpm_03200403.jpg"},{"uniquekey":"0ff0fd015ee5fd41a0cbcca966b991ff","title":"周星驰在《西游伏妖篇》里留的这几个伏笔，没看懂就别说烂片","date":"2018-05-17 07:59","category":"娱乐","author_name":"一论电影","url":"http://mini.eastday.com/mobile/180517075925791.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20180517/20180517_1b277311b2ce0fa61119e9fa6863cb65_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20180517/20180517_07604382c5dbfb2f827da4baa8270015_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20180517/20180517_f696475d399e20fc493bd94328c53fb7_mwpm_03200403.jpg"},{"uniquekey":"2b5cd232050587e555c2bc9fc3489797","title":"五月天改写自传纪录「OT」狂嗨六夜 15万员工香港星空打卡加","date":"2018-05-17 07:55","category":"娱乐","author_name":"五月天资讯站","url":"http://mini.eastday.com/mobile/180517075541409.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20180517/20180517075541_526cf8343e13a96510623f4eaed6ef9d_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20180517/20180517075541_526cf8343e13a96510623f4eaed6ef9d_7_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20180517/20180517075541_526cf8343e13a96510623f4eaed6ef9d_3_mwpm_03200403.jpg"},{"uniquekey":"816eda1e577e5ff9ef23c50b887d39d6","title":"王王栎鑫夫妇现身上海机场，小两口甜蜜耳语秀恩爱","date":"2018-05-17 07:53","category":"娱乐","author_name":"娱乐观视觉","url":"http://mini.eastday.com/mobile/180517075344808.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20180517/20180517075344_f58186c5152788e1e52cc29d52c5af18_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20180517/20180517075344_f58186c5152788e1e52cc29d52c5af18_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20180517/20180517075344_f58186c5152788e1e52cc29d52c5af18_3_mwpm_03200403.jpg"},{"uniquekey":"52e2ffe87f3e86496fc1c7be246cbb78","title":"就算《战狼3》拍成烂片，你也别怪吴京，因为《战狼3》太难拍了","date":"2018-05-17 07:47","category":"娱乐","author_name":"一论电影","url":"http://mini.eastday.com/mobile/180517074707730.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20180517/20180517_5bae68b3db1b84cd92ce5bc0f71f7866_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20180517/20180517_415fc4a14bc2eafe584f64b00b5fdfb3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20180517/20180517_297c4d0285bacd5767ce5e5de01175ef_mwpm_03200403.jpg"},{"uniquekey":"5e4f9d66a59e1ba901c4970f40fda6e9","title":"上海电影博物馆：用电影魅力，展现文化自信！","date":"2018-05-17 07:46","category":"娱乐","author_name":"娱乐星空连连看","url":"http://mini.eastday.com/mobile/180517074635051.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20180517/20180517074635_79e7436cb3221d9e9ff8d9eb37b62ed4_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20180517/20180517074635_79e7436cb3221d9e9ff8d9eb37b62ed4_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20180517/20180517074635_79e7436cb3221d9e9ff8d9eb37b62ed4_1_mwpm_03200403.jpg"},{"uniquekey":"882a28db0e7efddbb8b6130ede32ad7f","title":"《昼颜》电影版5月18日上映上户彩斋藤工伊藤步主演","date":"2018-05-17 07:44","category":"娱乐","author_name":"人民网本地站","url":"http://mini.eastday.com/mobile/180517074417680.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20180517/20180517074417_2ac081aeda99650a2dd42e61a9cd85ba_1_mwpm_03200403.jpg"},{"uniquekey":"b52a4b61ad44a8c5a148369dc63b9547","title":"李亚男，美美的","date":"2018-05-17 07:41","category":"娱乐","author_name":"影视小超人","url":"http://mini.eastday.com/mobile/180517074116872.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20180517/20180517074116_b5676bcb1595314ad855ecf72c509dde_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20180517/20180517074116_b5676bcb1595314ad855ecf72c509dde_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20180517/20180517074116_b5676bcb1595314ad855ecf72c509dde_3_mwpm_03200403.jpg"},{"uniquekey":"d891e50ac05eeaf89e8a1ae10830f96a","title":"震撼！震撼！易县狼牙山首届集体婚礼！看完都想结婚了！","date":"2018-05-17 07:37","category":"娱乐","author_name":"掌上易县","url":"http://mini.eastday.com/mobile/180517073751594.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20180517/20180517073751_3e6db215dfe5964eebe784f2b2283887_7_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20180517/20180517073751_3e6db215dfe5964eebe784f2b2283887_10_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20180517/20180517073751_3e6db215dfe5964eebe784f2b2283887_40_mwpm_03200403.jpg"},{"uniquekey":"068f2c5436c22e2811364b51a1f5cc31","title":"李连杰、甄子丹和吴京，谁拍电影更不要命？《战狼2》说明了一切","date":"2018-05-17 07:31","category":"娱乐","author_name":"一论电影","url":"http://mini.eastday.com/mobile/180517073123540.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20180517/20180517_02c41f797a2d9cc0b30e40c64225f50a_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20180517/20180517_26239cd5cb51e114614d181e42007509_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20180517/20180517_d8866e14ee91fb4aae8b0529619a0a29_mwpm_03200403.jpg"},{"uniquekey":"899ac7c1d63e549f26025e287c276dba","title":"宋茜黄景瑜《结爱》报告贺兰大人皮皮失恋，期待千年甜蜜一吻来啦","date":"2018-05-17 07:27","category":"娱乐","author_name":"蓓蕾娱心","url":"http://mini.eastday.com/mobile/180517072747376.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20180517/20180517_95ae6fad492a54f2cb844e8707de515d_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20180517/20180517_3fb64db14bc6fe4cd590bb49992ea1e5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20180517/20180517_500f3b51e820b0734e578521c2d20ed2_mwpm_03200403.jpg"},{"uniquekey":"dcd5aeadf220551f3dd3013bb9a0896f","title":"韩雪 现身上海机场","date":"2018-05-17 07:24","category":"娱乐","author_name":"春天的故事","url":"http://mini.eastday.com/mobile/180517072414288.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20180517/20180517072414_e850edcbec6c8152c665b76aee0471cb_6_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20180517/20180517072414_e850edcbec6c8152c665b76aee0471cb_7_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20180517/20180517072414_e850edcbec6c8152c665b76aee0471cb_4_mwpm_03200403.jpg"},{"uniquekey":"19ab5b1d4583adcc23da3db8af961384","title":"《地球最后的夜晚》长镜头惊艳观众汤唯黄觉张艾嘉李鸿其陈永忠主演","date":"2018-05-17 07:20","category":"娱乐","author_name":"人民网本地站","url":"http://mini.eastday.com/mobile/180517072057377.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20180517/20180517072057_fe6d5cc7d2a722f31d90762073931b38_1_mwpm_03200403.jpg"},{"uniquekey":"70676415648fce5a5d6d240436e5b377","title":"周星驰《武状元苏乞儿》经典，但张敏这个穿帮镜头，你肯定没发现","date":"2018-05-17 07:19","category":"娱乐","author_name":"一论电影","url":"http://mini.eastday.com/mobile/180517071901417.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20180517/20180517_7b10e0144ede268b7e150ba4b20efcb9_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20180517/20180517_99ce28456f0fd940320bb82437fdda65_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20180517/20180517_2cdb6d9aa84e050f2c4d0e16e013dcb3_mwpm_03200403.jpg"},{"uniquekey":"65501847a8d964a9b851718f679dfa18","title":"李晨替高云翔出场，网友称抠图版的《巴清传》还能看吗？","date":"2018-05-17 07:18","category":"娱乐","author_name":"娱乐星说","url":"http://mini.eastday.com/mobile/180517071834678.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20180517/20180517_81d54ab23ae6570c170c196643abfa10_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20180517/20180517_dcc1ab74cce6de135f40da6cab60dbe0_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20180517/20180517_14c1d9b19999011dc2e1c250eef1a434_cover_mwpm_03200403.jpg"},{"uniquekey":"c0ad14bf4a478e9c1af22b99c817573a","title":"林心如赴赞比亚探访被资助儿童：要给她个大大的拥抱","date":"2018-05-17 07:16","category":"娱乐","author_name":"东森新闻云","url":"http://mini.eastday.com/mobile/180517071616877.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20180517/20180517071616_a8fcc8d768899cc6ec60b866e05db4e8_1_mwpm_03200403.jpg"},{"uniquekey":"ba63bb655d631a71afd13502e330cf97","title":"《上海女子图鉴》:女孩儿也该当自强","date":"2018-05-17 07:10","category":"娱乐","author_name":"一呈影娱","url":"http://mini.eastday.com/mobile/180517071008684.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20180517/20180517071008_31b3c79e11e3b962363aa41a867ded00_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20180517/20180517071008_31b3c79e11e3b962363aa41a867ded00_7_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20180517/20180517071008_31b3c79e11e3b962363aa41a867ded00_3_mwpm_03200403.jpg"},{"uniquekey":"c9fe3a1f18f27602e0462dbe7346d492","title":"患难见真情？范冰冰有难李晨挺身而出，分文不取替代高云翔重拍","date":"2018-05-17 07:08","category":"娱乐","author_name":"电影小表哥","url":"http://mini.eastday.com/mobile/180517070859338.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20180517/20180516_b9bb3c22b35a129cecb2c9eabef1a9c9_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20180517/20180516_8fa8d516a5b0f803a759150f347204af_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20180517/20180516_ce6d292d4dcd3a01d27f6c85b96ba855_cover_mwpm_03200403.jpg"},{"uniquekey":"f6822302968290bc3d8f712a15efd1d1","title":"阿拉蕾成嘎纳最小嘉宾，身穿白色小洋装，可爱又大方","date":"2018-05-17 07:08","category":"娱乐","author_name":"北京时间","url":"http://mini.eastday.com/mobile/180517070824404.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20180517/20180517070824_a085fa9c76d0ed2409077450b5322acb_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20180517/20180517070824_a085fa9c76d0ed2409077450b5322acb_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20180517/20180517070824_a085fa9c76d0ed2409077450b5322acb_4_mwpm_03200403.jpg"},{"uniquekey":"2e08a53894ff25750091cb88147598d4","title":"《上海女子图鉴》正式接棒《北京女子图鉴》","date":"2018-05-17 06:58","category":"娱乐","author_name":"中视爱影","url":"http://mini.eastday.com/mobile/180517065812716.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20180517/20180517065812_602372496afbb9dd18a7f8b35f1d46e0_7_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20180517/20180517065812_602372496afbb9dd18a7f8b35f1d46e0_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20180517/20180517065812_602372496afbb9dd18a7f8b35f1d46e0_3_mwpm_03200403.jpg"},{"uniquekey":"abf280eda15d904b522cb4999ad77248","title":"张俪亮相某活动 网友：这件礼服是透明的？里面为什么是黑色的？","date":"2018-05-17 06:49","category":"娱乐","author_name":"我爱追TVB","url":"http://mini.eastday.com/mobile/180517064932886.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20180517/20180517064932_56453e797359989d2728177fb5206669_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20180517/20180517064932_56453e797359989d2728177fb5206669_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20180517/20180517064932_56453e797359989d2728177fb5206669_5_mwpm_03200403.jpg"},{"uniquekey":"09daf09ace2940dbd659650483c7bdae","title":"金星也太会穿了吧！连衣裙里套着阔腿裤够个性，网友：女人味十足","date":"2018-05-17 06:49","category":"娱乐","author_name":"隔壁八卦指南","url":"http://mini.eastday.com/mobile/180517064930669.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20180517/20180517064930_dc4851c3e417a78a1b8c6df36f674421_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20180517/20180517064930_dc4851c3e417a78a1b8c6df36f674421_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20180517/20180517064930_dc4851c3e417a78a1b8c6df36f674421_5_mwpm_03200403.jpg"},{"uniquekey":"0b18d990321e3e7d879c5ff70df052a5","title":"37岁的宋慧乔现身上海, 颜值容貌依旧, 但是身材却已发福","date":"2018-05-17 06:34","category":"娱乐","author_name":"娱珈歪歪娱","url":"http://mini.eastday.com/mobile/180517063440388.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20180517/20180517_f3dd2ba9e19df982936106dca8073e58_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20180517/20180517_d89974d467ad1e85cfdef26f7e389c71_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20180517/20180517_720654f3f69a439a6ec5696bf3ab7630_cover_mwpm_03200403.jpg"},{"uniquekey":"b2df2978adaa98b1da0457a518c2bf47","title":"演技不输章子怡，现如今张凯丽给唐嫣当配角","date":"2018-05-17 06:27","category":"娱乐","author_name":"娱乐快讯丶","url":"http://mini.eastday.com/mobile/180517062755053.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20180517/20180517062755_2adfbc0b7b3848b54a33c4eb88552d5c_6_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20180517/20180517062755_2adfbc0b7b3848b54a33c4eb88552d5c_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20180517/20180517062755_2adfbc0b7b3848b54a33c4eb88552d5c_7_mwpm_03200403.jpg"},{"uniquekey":"6567e925a4392ac9bffe33fc724ffd08","title":"崔健要来了！乌金山辣椒音乐节即将开始！这一次要High翻全场！","date":"2018-05-17 06:24","category":"娱乐","author_name":"浓情三晋","url":"http://mini.eastday.com/mobile/180517062420291.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20180517/20180517062420_e0102b7046e80de26969aa8639a0da67_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20180517/20180517062420_e0102b7046e80de26969aa8639a0da67_6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20180517/20180517062420_e0102b7046e80de26969aa8639a0da67_20_mwpm_03200403.jpg"},{"uniquekey":"9f5d3fb77a79cf78a98eab9d388c1fcd","title":"香港电影大佬排名，向华强只能倒数，第一名意料之中","date":"2018-05-17 06:15","category":"娱乐","author_name":"北京时间","url":"http://mini.eastday.com/mobile/180517061541588.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20180517/20180517061541_da880cddd659010577e04fb3faef670a_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20180517/20180517061541_da880cddd659010577e04fb3faef670a_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20180517/20180517061541_da880cddd659010577e04fb3faef670a_4_mwpm_03200403.jpg"}]
         */

        private String stat;
        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * uniquekey : 39d0b8f28bf81bed286d712b217ba13d
             * title : 《等着我》第四季创新“三台合一”新传播模式
             * date : 2018-05-17 08:04
             * category : 娱乐
             * author_name : 国际在线
             * url : http://mini.eastday.com/mobile/180517080444165.html
             * thumbnail_pic_s : http://05.imgmini.eastday.com/mobile/20180517/20180517080444_3646f64d1bc75af5f410ea26025fb6ef_1_mwpm_03200403.jpg
             * thumbnail_pic_s02 : http://05.imgmini.eastday.com/mobile/20180517/20180517080444_7eb021518b7814df6d17c45a5d33a2f3_2_mwpm_03200403.jpg
             * thumbnail_pic_s03 : http://05.imgmini.eastday.com/mobile/20180517/20180517080444_ce546607e1d5c0573101f704c5b2be5d_4_mwpm_03200403.jpg
             */

            private String uniquekey;
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }
        }
    }


}
