package com.vsked.jt808;

/**
 * 中华人民共和国交通运输行业标准
 * 道路运输车辆卫星定位系统终端通信协议
 */
public interface JT808MessageID {

    /**
     * 终端通用应答
     * 终端 --> 平台 (上行消息)
     */
    int terminalGeneralResponse = 0x0001;

    /**
     * 终端心跳请求
     * 终端 --> 平台 (上行消息)
     */
    int terminalHeartbeatRequest = 0x0002;

    /**
     * 终端注销请求
     * 终端 --> 平台 (上行消息)
     */
    int terminalLogoutRequest = 0x0003;

    /**
     * 查询服务器时间请求 2019 new
     * 终端 --> 平台 (上行消息)
     */
    int queryServerTimeRequest = 0x0004;

    /**
     * 终端补传分包请求 2019 new
     * 终端 --> 平台 (上行消息)
     */
    int terminalRetransmissionRequest = 0x0005;

    /**
     * 终端注册请求
     * 终端 --> 平台 (上行消息)
     */
    int terminalRegisterRequest = 0x0100;

    /**
     * 终端鉴权请求 2019 modify
     * 终端 --> 平台 (上行消息)
     */
    int terminalAuthenticationRequest = 0x0102;

    /**
     * 查询终端参数应答
     * 终端 --> 平台 (上行消息)
     */
    int queryTerminalParametersResponse = 0x0104;

    /**
     * 查询终端属性应答
     * 终端 --> 平台 (上行消息)
     */
    int queryTerminalPropertiesResponse = 0x0107;

    /**
     * 终端升级结果通知
     * 终端 --> 平台 (上行消息)
     */
    int terminalUpgradeResultNotification = 0x0108;

    /**
     * 位置信息汇报
     * 终端 --> 平台 (上行消息)
     */
    int locationInformationReport = 0x0200;

    /**
     * 位置信息查询应答
     * 终端 --> 平台 (上行消息)
     */
    int locationInformationQueryResponse = 0x0201;

    /**
     * 事件报告 2019 del
     * 终端 --> 平台 (上行消息)
     */
    int eventReport = 0x0301;

    /**
     * 提问答复 2019 del
     * 终端 --> 平台 (上行消息)
     */
    int questionResponse = 0x0302;

    /**
     * 信息点播/取消 2019 del
     * 终端 --> 平台 (上行消息)
     */
    int informationBroadcastCancel = 0x0303;

    /**
     * 车辆控制应答
     * 终端 --> 平台 (上行消息)
     */
    int vehicleControlResponse = 0x0500;

    /**
     * 查询区域或线路数据应答 2019 new
     * 终端 --> 平台 (上行消息)
     */
    int queryAreaOrRouteDataResponse = 0x0608;

    /**
     * 行驶记录数据上传
     * 终端 --> 平台 (上行消息)
     */
    int drivingRecordDataUpload = 0x0700;

    /**
     * 电子运单上报
     * 终端 --> 平台 (上行消息)
     */
    int electronicWaybillUpload = 0x0701;

    /**
     * 驾驶员身份信息采集上报 2019 modify
     * 终端 --> 平台 (上行消息)
     */
    int driverIdentityInformationCollectionUpload = 0x0702;

    /**
     * 定位数据批量上传
     * 终端 --> 平台 (上行消息)
     */
    int positioningDataBatchUpload = 0x0704;

    /**
     * CAN总线数据上传
     * 终端 --> 平台 (上行消息)
     */
    int canBusDataUpload = 0x0705;

    /**
     * 多媒体事件信息上传
     * 终端 --> 平台 (上行消息)
     */
    int multimediaEventInformationUpload = 0x0800;

    /**
     * 多媒体数据上传
     * 终端 --> 平台 (上行消息)
     */
    int multimediaDataUpload = 0x0801;

    /**
     * 存储多媒体数据检索应答
     * 终端 --> 平台 (上行消息)
     */
    int storageMultimediaDataRetrievalResponse = 0x0802;

    /**
     * 摄像头立即拍摄命令应答
     * 终端 --> 平台 (上行消息)
     */
    int cameraImmediateCaptureCommandResponse = 0x0805;

    /**
     * 数据上行透传
     * 终端 --> 平台 (上行消息)
     */
    int dataUplinkTransparentTransmission = 0x0900;

    /**
     * 数据压缩上报
     * 终端 --> 平台 (上行消息)
     */
    int dataCompressionUpload = 0x0901;

    /**
     * 终端RSA公钥
     * 终端 --> 平台 (上行消息)
     */
    int terminalRsaPublicKey = 0x0A00;

    /**
     * 终端上行消息保留
     * 终端 --> 平台 (上行消息)
     */
    int terminalUplinkReserved = 0x0F00 - 0x0FFF;

    /**
     * 平台通用应答
     * 平台 --> 终端 (下行消息)
     */
    int platformGeneralResponse = 0x8001;

    /**
     * 服务器补传分包请求
     * 平台 --> 终端 (下行消息)
     */
    int serverRetransmissionRequest = 0x8003;

    /**
     * 查询服务器时间应答 2019 new
     * 平台 --> 终端 (下行消息)
     */
    int queryServerTimeResponse = 0x8004;

    /**
     * 终端注册应答
     * 平台 --> 终端 (下行消息)
     */
    int terminalRegisterResponse = 0x8100;

    /**
     * 设置终端参数请求
     * 平台 --> 终端 (下行消息)
     */
    int setTerminalParametersRequest = 0x8103;

    /**
     * 查询终端参数请求
     * 平台 --> 终端 (下行消息)
     */
    int queryTerminalParametersRequest = 0x8104;

    /**
     * 终端控制请求
     * 平台 --> 终端 (下行消息)
     */
    int terminalControlRequest = 0x8105;

    /**
     * 查询指定终端参数请求
     * 平台 --> 终端 (下行消息)
     */
    int querySpecificTerminalParametersRequest = 0x8106;

    /**
     * 查询终端属性
     * 平台 --> 终端 (下行消息)
     */
    int queryTerminalPropertiesRequest = 0x8107;

    /**
     * 下发终端升级包
     * 平台 --> 终端 (下行消息)
     */
    int issueTerminalUpgradePackage = 0x8108;

    /**
     * 位置信息查询
     * 平台 --> 终端 (下行消息)
     */
    int locationInformationQueryRequest = 0x8201;

    /**
     * 临时位置跟踪控制
     * 平台 --> 终端 (下行消息)
     */
    int temporaryPositionTrackingControl = 0x8202;

    /**
     * 人工确认报警消息
     * 平台 --> 终端 (下行消息)
     */
    int manualConfirmationAlarmMessage = 0x8203;

    /**
     * 服务器向终端发起链路检测请求 2019 new
     * 平台 --> 终端 (下行消息)
     */
    int serverInitiateLinkDetectionRequestToTerminal = 0x8204;

    /**
     * 文本信息下发 2019 modify
     * 平台 --> 终端 (下行消息)
     */
    int textInformationIssue = 0x8300;

    /**
     * 事件设置 2019 del
     * 平台 --> 终端 (下行消息)
     */
    int eventSetting = 0x8301;

    /**
     * 提问下发 2019 del
     * 平台 --> 终端 (下行消息)
     */
    int questionIssue = 0x8302;

    /**
     * 信息点播菜单设置 2019 del
     * 平台 --> 终端 (下行消息)
     */
    int informationBroadcastMenuSetting = 0x8303;

    /**
     * 信息服务 2019 del
     * 平台 --> 终端 (下行消息)
     */
    int informationService = 0x8304;

    /**
     * 电话回拨
     * 平台 --> 终端 (下行消息)
     */
    int phoneCallback = 0x8400;

    /**
     * 设置电话本
     * 平台 --> 终端 (下行消息)
     */
    int setPhonebook = 0x8401;

    /**
     * 车辆控制 2019 modify
     * 平台 --> 终端 (下行消息)
     */
    int vehicleControl = 0x8500;

    /**
     * 设置圆形区域 2019 modify
     * 平台 --> 终端 (下行消息)
     */
    int setCircularArea = 0x8600;

    /**
     * 删除圆形区域
     * 平台 --> 终端 (下行消息)
     */
    int deleteCircularArea = 0x8601;

    /**
     * 设置矩形区域 2019 modify
     * 平台 --> 终端 (下行消息)
     */
    int setRectangularArea = 0x8602;

    /**
     * 删除矩形区域
     * 平台 --> 终端 (下行消息)
     */
    int deleteRectangularArea = 0x8603;

    /**
     * 设置多边形区域 2019 modify
     * 平台 --> 终端 (下行消息)
     */
    int setPolygonalArea = 0x8604;

    /**
     * 删除多边形区域
     * 平台 --> 终端 (下行消息)
     */
    int deletePolygonalArea = 0x8605;

    /**
     * 设置路线
     * 平台 --> 终端 (下行消息)
     */
    int setRoute = 0x8606;

    /**
     * 删除路线
     * 平台 --> 终端 (下行消息)
     */
    int deleteRoute = 0x8607;

    /**
     * 查询区域或线路数据
     * 平台 --> 终端 (下行消息)
     */
    int queryAreaOrRouteData = 0x8608;//2019 new

    /**
     * 行驶记录仪数据采集命令
     * 平台 --> 终端 (下行消息)
     */
    int drivingRecorderDataAcquisitionCommand = 0x8700;

    /**
     * 行驶记录仪参数下传命令
     * 平台 --> 终端 (下行消息)
     */
    int drivingRecorderParameterDownlinkCommand = 0x8701;

    /**
     * 上报驾驶员身份信息请求
     * 平台 --> 终端 (下行消息)
     */
    int reportDriverIdentityInformationRequest = 0x8702;

    /**
     * 多媒体数据上传应答
     * 平台 --> 终端 (下行消息)
     */
    int multimediaDataUploadResponse = 0x8800;

    /**
     * 摄像头立即拍摄命令
     * 平台 --> 终端 (下行消息)
     */
    int cameraImmediateCaptureCommand = 0x8801;

    /**
     * 存储多媒体数据检索
     * 平台 --> 终端 (下行消息)
     */
    int storageMultimediaDataRetrieval = 0x8802;

    /**
     * 存储多媒体数据上传
     * 平台 --> 终端 (下行消息)
     */
    int storageMultimediaDataUpload = 0x8803;

    /**
     * 录音开始命令
     * 平台 --> 终端 (下行消息)
     */
    int recordingStartCommand = 0x8804;

    /**
     * 单条存储多媒体数据检索上传命令
     * 平台 --> 终端 (下行消息)
     */
    int singleStorageMultimediaDataRetrievalUploadCommand = 0x8805;

    /**
     * 数据下行透传
     * 平台 --> 终端 (下行消息)
     */
    int dataDownlinkTransparentTransmission = 0x8900;

    /**
     * 平台RSA公钥
     * 平台 --> 终端 (下行消息)
     */
    int platformRsaPublicKey = 0x8A00;

    /**
     * 平台下行消息保留
     * 平台 --> 终端 (下行消息)
     */
    int platformDownlinkReserved = 0x8F00 - 0x8FFF;

    /**
     * 厂商自定义上行消息 2019 new
     * 终端 --> 平台 (上行消息)
     */
    int manufacturerCustomUplink = 0xE000 - 0xEFFF;

    /**
     * 厂商自定义下行消息 2019 new
     * 终端 --> 平台 (下行消息)
     */
    int commercialCustomDownlink = 0xF000 - 0xFFFF;
}
