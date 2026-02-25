package com.vsked.jt808;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class JT808MessageIDTest {

    private static final Logger log = LoggerFactory.getLogger(JT808MessageIDTest.class);

    private void formatOutput(String description, int messageId) {
        log.debug("{}, 十六进制：0x{} ，十进制 {}",description, String.format("%04X", messageId), messageId);
    }

    @Test
    public void terminalGeneralResponse() {
        formatOutput("终端通用应答", JT808MessageID.terminalGeneralResponse);
    }

    @Test
    public void terminalHeartbeat() {
        formatOutput("终端心跳请求", JT808MessageID.terminalHeartbeatRequest);
    }

    @Test
    public void terminalLogout() {
        formatOutput("终端注销请求", JT808MessageID.terminalLogoutRequest);
    }

    @Test
    public void queryServerTime() {
        formatOutput("查询服务器时间请求", JT808MessageID.queryServerTimeRequest);
    }

    @Test
    public void terminalRetransmission() {
        formatOutput("终端补传分包请求", JT808MessageID.terminalRetransmissionRequest);
    }

    @Test
    public void terminalRegister() {
        formatOutput("终端注册请求", JT808MessageID.terminalRegisterRequest);
    }

    @Test
    public void terminalAuthentication() {
        formatOutput("终端鉴权请求", JT808MessageID.terminalAuthenticationRequest);
    }

    @Test
    public void queryTerminalParameters() {
        formatOutput("查询终端参数应答", JT808MessageID.queryTerminalParametersResponse);
    }

    @Test
    public void queryTerminalProperties() {
        formatOutput("查询终端属性应答", JT808MessageID.queryTerminalPropertiesResponse);
    }

    @Test
    public void terminalUpgradeResult() {
        formatOutput("终端升级结果通知", JT808MessageID.terminalUpgradeResultNotification);
    }

    @Test
    public void locationInformationReport() {
        formatOutput("位置信息汇报", JT808MessageID.locationInformationReport);
    }

    @Test
    public void locationInformationQuery() {
        formatOutput("位置信息查询应答", JT808MessageID.locationInformationQueryResponse);
    }

    @Test
    public void eventReport() {
        formatOutput("事件报告", JT808MessageID.eventReport);
    }

    @Test
    public void questionResponse() {
        formatOutput("提问答复", JT808MessageID.questionResponse);
    }

    @Test
    public void informationBroadcastCancel() {
        formatOutput("信息点播/取消", JT808MessageID.informationBroadcastCancel);
    }

    @Test
    public void vehicleControl() {
        formatOutput("车辆控制应答", JT808MessageID.vehicleControlResponse);
    }

    @Test
    public void queryAreaOrRouteData() {
        formatOutput("查询区域或线路数据应答", JT808MessageID.queryAreaOrRouteDataResponse);
    }

    @Test
    public void drivingRecordData() {
        formatOutput("行驶记录数据上传", JT808MessageID.drivingRecordDataUpload);
    }

    @Test
    public void electronicWaybill() {
        formatOutput("电子运单上报", JT808MessageID.electronicWaybillUpload);
    }

    @Test
    public void driverIdentityInformationCollection() {
        formatOutput("驾驶员身份信息采集上报", JT808MessageID.driverIdentityInformationCollectionUpload);
    }

    @Test
    public void positioningDataBatch() {
        formatOutput("定位数据批量上传", JT808MessageID.positioningDataBatchUpload);
    }

    @Test
    public void canBusData() {
        formatOutput("CAN总线数据上传", JT808MessageID.canBusDataUpload);
    }

    @Test
    public void multimediaEventInformation() {
        formatOutput("多媒体事件信息上传", JT808MessageID.multimediaEventInformationUpload);
    }

    @Test
    public void multimediaDataUpload() {
        formatOutput("多媒体数据上传", JT808MessageID.multimediaDataUpload);
    }

    @Test
    public void storageMultimediaDataRetrieval() {
        formatOutput("存储多媒体数据检索应答", JT808MessageID.storageMultimediaDataRetrievalResponse);
    }

    @Test
    public void cameraImmediateCaptureCommand() {
        formatOutput("摄像头立即拍摄命令应答", JT808MessageID.cameraImmediateCaptureCommandResponse);
    }

    @Test
    public void dataUplinkTransparent() {
        formatOutput("数据上行透传", JT808MessageID.dataUplinkTransparentTransmission);
    }

    @Test
    public void dataCompression() {
        formatOutput("数据压缩上报", JT808MessageID.dataCompressionUpload);
    }

    @Test
    public void terminalRsaPublicKey() {
        formatOutput("终端RSA公钥", JT808MessageID.terminalRsaPublicKey);
    }

    @Test
    public void terminalUplinkReserved() {
        formatOutput("终端上行消息保留", JT808MessageID.terminalUplinkReserved);
    }

    @Test
    public void platformGeneralResponse() {
        formatOutput("平台通用应答", JT808MessageID.platformGeneralResponse);
    }

    @Test
    public void serverRetransmission() {
        formatOutput("服务器补传分包请求", JT808MessageID.serverRetransmissionRequest);
    }

    @Test
    public void queryServerTimeResponse() {
        formatOutput("查询服务器时间应答", JT808MessageID.queryServerTimeResponse);
    }

    @Test
    public void terminalRegisterResponse() {
        formatOutput("终端注册应答", JT808MessageID.terminalRegisterResponse);
    }

    @Test
    public void setTerminalParameters() {
        formatOutput("设置终端参数请求", JT808MessageID.setTerminalParametersRequest);
    }

    @Test
    public void queryTerminalParametersRequest() {
        formatOutput("查询终端参数请求", JT808MessageID.queryTerminalParametersRequest);
    }

    @Test
    public void terminalControl() {
        formatOutput("终端控制请求", JT808MessageID.terminalControlRequest);
    }

    @Test
    public void querySpecificTerminalParameters() {
        formatOutput("查询指定终端参数请求", JT808MessageID.querySpecificTerminalParametersRequest);
    }

    @Test
    public void queryTerminalPropertiesRequest() {
        formatOutput("查询终端属性", JT808MessageID.queryTerminalPropertiesRequest);
    }

    @Test
    public void issueTerminalUpgradePackage() {
        formatOutput("下发终端升级包", JT808MessageID.issueTerminalUpgradePackage);
    }

    @Test
    public void locationInformationQueryRequest() {
        formatOutput("位置信息查询", JT808MessageID.locationInformationQueryRequest);
    }

    @Test
    public void temporaryPositionTracking() {
        formatOutput("临时位置跟踪控制", JT808MessageID.temporaryPositionTrackingControl);
    }

    @Test
    public void manualConfirmationAlarm() {
        formatOutput("人工确认报警消息", JT808MessageID.manualConfirmationAlarmMessage);
    }

    @Test
    public void serverInitiateLinkDetection() {
        formatOutput("服务器向终端发起链路检测请求", JT808MessageID.serverInitiateLinkDetectionRequestToTerminal);
    }

    @Test
    public void textInformation() {
        formatOutput("文本信息下发", JT808MessageID.textInformationIssue);
    }

    @Test
    public void eventSetting() {
        formatOutput("事件设置", JT808MessageID.eventSetting);
    }

    @Test
    public void questionIssue() {
        formatOutput("提问下发", JT808MessageID.questionIssue);
    }

    @Test
    public void informationBroadcastMenu() {
        formatOutput("信息点播菜单设置", JT808MessageID.informationBroadcastMenuSetting);
    }

    @Test
    public void informationService() {
        formatOutput("信息服务", JT808MessageID.informationService);
    }

    @Test
    public void phoneCallback() {
        formatOutput("电话回拨", JT808MessageID.phoneCallback);
    }

    @Test
    public void setPhonebook() {
        formatOutput("设置电话本", JT808MessageID.setPhonebook);
    }

    @Test
    public void vehicleControlRequest() {
        formatOutput("车辆控制", JT808MessageID.vehicleControl);
    }

    @Test
    public void setCircularArea() {
        formatOutput("设置圆形区域", JT808MessageID.setCircularArea);
    }

    @Test
    public void deleteCircularArea() {
        formatOutput("删除圆形区域", JT808MessageID.deleteCircularArea);
    }

    @Test
    public void setRectangularArea() {
        formatOutput("设置矩形区域", JT808MessageID.setRectangularArea);
    }

    @Test
    public void deleteRectangularArea() {
        formatOutput("删除矩形区域", JT808MessageID.deleteRectangularArea);
    }

    @Test
    public void setPolygonalArea() {
        formatOutput("设置多边形区域", JT808MessageID.setPolygonalArea);
    }

    @Test
    public void deletePolygonalArea() {
        formatOutput("删除多边形区域", JT808MessageID.deletePolygonalArea);
    }

    @Test
    public void setRoute() {
        formatOutput("设置路线", JT808MessageID.setRoute);
    }

    @Test
    public void deleteRoute() {
        formatOutput("删除路线", JT808MessageID.deleteRoute);
    }

    @Test
    public void queryAreaOrRouteDataRequest() {
        formatOutput("查询区域或线路数据", JT808MessageID.queryAreaOrRouteData);
    }

    @Test
    public void drivingRecorderDataAcquisition() {
        formatOutput("行驶记录仪数据采集命令", JT808MessageID.drivingRecorderDataAcquisitionCommand);
    }

    @Test
    public void drivingRecorderParameterDownlink() {
        formatOutput("行驶记录仪参数下传命令", JT808MessageID.drivingRecorderParameterDownlinkCommand);
    }

    @Test
    public void reportDriverIdentityInformation() {
        formatOutput("上报驾驶员身份信息请求", JT808MessageID.reportDriverIdentityInformationRequest);
    }

    @Test
    public void multimediaDataUploadResponse() {
        formatOutput("多媒体数据上传应答", JT808MessageID.multimediaDataUploadResponse);
    }

    @Test
    public void cameraImmediateCaptureCommandRequest() {
        formatOutput("摄像头立即拍摄命令", JT808MessageID.cameraImmediateCaptureCommand);
    }

    @Test
    public void storageMultimediaDataRetrievalRequest() {
        formatOutput("存储多媒体数据检索", JT808MessageID.storageMultimediaDataRetrieval);
    }

    @Test
    public void storageMultimediaDataUpload() {
        formatOutput("存储多媒体数据上传", JT808MessageID.storageMultimediaDataUpload);
    }

    @Test
    public void recordingStart() {
        formatOutput("录音开始命令", JT808MessageID.recordingStartCommand);
    }

    @Test
    public void singleStorageMultimediaDataRetrievalUpload() {
        formatOutput("单条存储多媒体数据检索上传命令", JT808MessageID.singleStorageMultimediaDataRetrievalUploadCommand);
    }

    @Test
    public void dataDownlinkTransparent() {
        formatOutput("数据下行透传", JT808MessageID.dataDownlinkTransparentTransmission);
    }

    @Test
    public void platformRsaPublicKey() {
        formatOutput("平台RSA公钥", JT808MessageID.platformRsaPublicKey);
    }

    @Test
    public void platformDownlinkReserved() {
        formatOutput("平台下行消息保留", JT808MessageID.platformDownlinkReserved);
    }

    @Test
    public void manufacturerCustomUplink() {
        formatOutput("厂商自定义上行消息", JT808MessageID.manufacturerCustomUplink);
    }

    @Test
    public void commercialCustomDownlink() {
        formatOutput("商自定义下行消息", JT808MessageID.commercialCustomDownlink);
    }
}
