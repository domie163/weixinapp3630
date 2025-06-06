<template>
	<view class="content">
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0)","margin":"0","borderStyle":"solid","borderWidth":"0 ","height":"100rpx"}' v-if="tableName=='xuesheng'" class="cu-form-group">
			<view class="title" :style='{"width":"25%","fontSize":"26rpx","color":"rgba(68, 68, 68, 1)","textAlign":"center"}'>用户名</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.yonghuming" placeholder="用户名"></input>
		</view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0)","margin":"0","borderStyle":"solid","borderWidth":"0 ","height":"100rpx"}' v-if="tableName=='xuesheng'" class="cu-form-group">
			<view class="title" :style='{"width":"25%","fontSize":"26rpx","color":"rgba(68, 68, 68, 1)","textAlign":"center"}'>密码</view>
			<input type="password" style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.mima" placeholder="密码"></input>
		</view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0)","margin":"0","borderStyle":"solid","borderWidth":"0 ","height":"100rpx"}' v-if="tableName=='xuesheng'" class="cu-form-group">
			<view class="title" :style='{"width":"25%","fontSize":"26rpx","color":"rgba(68, 68, 68, 1)","textAlign":"center"}'>姓名</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.xingming" placeholder="姓名"></input>
		</view>
			<view v-if="tableName=='xuesheng'" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(245, 245, 245, 1)","borderColor":"rgba(245, 245, 245, 1)","margin":"0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group select">
                                <view :style='{"width":"25%","fontSize":"26rpx","color":"rgba(68, 68, 68, 1)","textAlign":"center"}' class="title">性别</view>
                                <picker @change="xueshengxingbieChange" :value="xueshengxingbieIndex" :range="xueshengxingbieOptions">
                                        <view style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' class="uni-input picker-select-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
                                </picker>
                        </view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0)","margin":"0","borderStyle":"solid","borderWidth":"0 ","height":"100rpx"}' v-if="tableName=='xuesheng'" class="cu-form-group">
			<view class="title" :style='{"width":"25%","fontSize":"26rpx","color":"rgba(68, 68, 68, 1)","textAlign":"center"}'>年龄</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.nianling" placeholder="年龄"></input>
		</view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0)","margin":"0","borderStyle":"solid","borderWidth":"0 ","height":"100rpx"}' v-if="tableName=='xuesheng'" class="cu-form-group">
			<view class="title" :style='{"width":"25%","fontSize":"26rpx","color":"rgba(68, 68, 68, 1)","textAlign":"center"}'>手机</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.shouji" placeholder="手机"></input>
		</view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0)","margin":"0","borderStyle":"solid","borderWidth":"0 ","height":"100rpx"}' v-if="tableName=='xuesheng'" class="cu-form-group">
			<view class="title" :style='{"width":"25%","fontSize":"26rpx","color":"rgba(68, 68, 68, 1)","textAlign":"center"}'>邮箱</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.youxiang" placeholder="邮箱"></input>
		</view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0)","margin":"0","borderStyle":"solid","borderWidth":"0 ","height":"100rpx"}' v-if="tableName=='xuesheng'" @tap="xueshengtouxiangTap" class="cu-form-group" :class="left == 'left'?'':'active'">
			<view class="title" :style='{"width":"25%","fontSize":"26rpx","color":"rgba(68, 68, 68, 1)","textAlign":"center"}'>头像</view>
			<view style="flex: 1;textAlign:left">
				<image :style='{"width":"80rpx","boxShadow":"0 0 8rpx rgba(0,0,0,.3)","borderRadius":"40rpx","textAlign":"left","height":"80rpx"}' v-if="ruleForm.touxiang" style="margin: 0;" class="avator" :src="ruleForm.touxiang" mode=""></image>
				<image :style='{"width":"80rpx","boxShadow":"0 0 8rpx rgba(0,0,0,.3)","borderRadius":"40rpx","textAlign":"left","height":"80rpx"}' v-else class="avator" style="margin: 0;" src="../../static/center/face.jpeg" mode=""></image>
			</view>
		</view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0)","margin":"0","borderStyle":"solid","borderWidth":"0 ","height":"100rpx"}' v-if="tableName=='maijiayonghu'" class="cu-form-group">
			<view class="title" :style='{"width":"25%","fontSize":"26rpx","color":"rgba(68, 68, 68, 1)","textAlign":"center"}'>卖家账号</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.maijiazhanghao" placeholder="卖家账号"></input>
		</view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0)","margin":"0","borderStyle":"solid","borderWidth":"0 ","height":"100rpx"}' v-if="tableName=='maijiayonghu'" class="cu-form-group">
			<view class="title" :style='{"width":"25%","fontSize":"26rpx","color":"rgba(68, 68, 68, 1)","textAlign":"center"}'>密码</view>
			<input type="password" style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.mima" placeholder="密码"></input>
		</view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0)","margin":"0","borderStyle":"solid","borderWidth":"0 ","height":"100rpx"}' v-if="tableName=='maijiayonghu'" class="cu-form-group">
			<view class="title" :style='{"width":"25%","fontSize":"26rpx","color":"rgba(68, 68, 68, 1)","textAlign":"center"}'>卖家姓名</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.maijiaxingming" placeholder="卖家姓名"></input>
		</view>
			<view v-if="tableName=='maijiayonghu'" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(245, 245, 245, 1)","borderColor":"rgba(245, 245, 245, 1)","margin":"0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group select">
                                <view :style='{"width":"25%","fontSize":"26rpx","color":"rgba(68, 68, 68, 1)","textAlign":"center"}' class="title">性别</view>
                                <picker @change="maijiayonghuxingbieChange" :value="maijiayonghuxingbieIndex" :range="maijiayonghuxingbieOptions">
                                        <view style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' class="uni-input picker-select-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
                                </picker>
                        </view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0)","margin":"0","borderStyle":"solid","borderWidth":"0 ","height":"100rpx"}' v-if="tableName=='maijiayonghu'" class="cu-form-group">
			<view class="title" :style='{"width":"25%","fontSize":"26rpx","color":"rgba(68, 68, 68, 1)","textAlign":"center"}'>学号</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.xuehao" placeholder="学号"></input>
		</view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0)","margin":"0","borderStyle":"solid","borderWidth":"0 ","height":"100rpx"}' v-if="tableName=='maijiayonghu'" class="cu-form-group">
			<view class="title" :style='{"width":"25%","fontSize":"26rpx","color":"rgba(68, 68, 68, 1)","textAlign":"center"}'>学校</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.xuexiao" placeholder="学校"></input>
		</view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0)","margin":"0","borderStyle":"solid","borderWidth":"0 ","height":"100rpx"}' v-if="tableName=='maijiayonghu'" class="cu-form-group">
			<view class="title" :style='{"width":"25%","fontSize":"26rpx","color":"rgba(68, 68, 68, 1)","textAlign":"center"}'>卖家手机</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.maijiashouji" placeholder="卖家手机"></input>
		</view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0)","margin":"0","borderStyle":"solid","borderWidth":"0 ","height":"100rpx"}' v-if="tableName=='maijiayonghu'" class="cu-form-group">
			<view class="title" :style='{"width":"25%","fontSize":"26rpx","color":"rgba(68, 68, 68, 1)","textAlign":"center"}'>联系邮箱</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.lianxiyouxiang" placeholder="联系邮箱"></input>
		</view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0)","margin":"0","borderStyle":"solid","borderWidth":"0 ","height":"100rpx"}' v-if="tableName=='maijiayonghu'" @tap="maijiayonghuzhaopianTap" class="cu-form-group" :class="left == 'left'?'':'active'">
			<view class="title" :style='{"width":"25%","fontSize":"26rpx","color":"rgba(68, 68, 68, 1)","textAlign":"center"}'>照片</view>
			<view style="flex: 1;textAlign:left">
				<image :style='{"width":"80rpx","boxShadow":"0 0 8rpx rgba(0,0,0,.3)","borderRadius":"40rpx","textAlign":"left","height":"80rpx"}' v-if="ruleForm.zhaopian" style="margin: 0;" class="avator" :src="ruleForm.zhaopian" mode=""></image>
				<image :style='{"width":"80rpx","boxShadow":"0 0 8rpx rgba(0,0,0,.3)","borderRadius":"40rpx","textAlign":"left","height":"80rpx"}' v-else class="avator" style="margin: 0;" src="../../static/center/face.jpeg" mode=""></image>
			</view>
		</view>
		
		<view class="btn">
			<view class="box" :style="{width: '48%'}">
				<button @tap="update()" class="cu-btn lg" :style='{"boxShadow":"0 0 0px rgba(0,0,0,0) inset","backgroundColor":"rgba(26, 172, 25, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"8rpx","color":"#fff","borderWidth":"0","width":"48%","fontSize":"32rpx","borderStyle":"solid","height":"88rpx"}'>保存</button>
			</view>

			<view class="box" :style="{width: '48%'}">
				<button @tap="logout()" class="cu-btn lg" :style='{"boxShadow":"0 0 0px rgba(0,0,0,0) inset","backgroundColor":"rgba(224, 69, 67, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"8rpx","color":"rgba(255, 255, 255, 1)","borderWidth":"0","width":"48%","fontSize":"32rpx","borderStyle":"solid","height":"88rpx"}'>退出登录</button>
			</view>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				ruleForm: {
				},
				tableName:"",
				xueshengxingbieOptions: [],
				xueshengxingbieIndex: 0,
				maijiayonghuxingbieOptions: [],
				maijiayonghuxingbieIndex: 0,
			}
		},
		async onLoad() {
			let table = uni.getStorageSync("nowTable");
			let res = await this.$api.session(table);
			this.ruleForm = res.data;
			this.tableName = table;
			// 自定义下拉框值
			if(this.tableName=='xuesheng'){
				this.xueshengxingbieOptions = "男,女".split(',');
				this.xueshengxingbieOptions.forEach((item, index) => {
					if(item==this.ruleForm.xingbie) {
						this.xueshengxingbieIndex = index;
					}
				});
			}
			// 自定义下拉框值
			if(this.tableName=='maijiayonghu'){
				this.maijiayonghuxingbieOptions = "男,女".split(',');
				this.maijiayonghuxingbieOptions.forEach((item, index) => {
					if(item==this.ruleForm.xingbie) {
						this.maijiayonghuxingbieIndex = index;
					}
				});
			}
			this.styleChange()
		},
		methods: {
                        // 下拉变化
                        xueshengxingbieChange(e) {
                                this.xueshengxingbieIndex = e.target.value
                                this.ruleForm.xingbie = this.xueshengxingbieOptions[this.xueshengxingbieIndex]
                        },
                        // 下拉变化
                        maijiayonghuxingbieChange(e) {
                                this.maijiayonghuxingbieIndex = e.target.value
                                this.ruleForm.xingbie = this.maijiayonghuxingbieOptions[this.maijiayonghuxingbieIndex]
                        },
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.cu-form-group .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.userInfoForm.list.input.backgroundColor
					// })
				})
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			logout() {
				uni.setStorageSync('token', '');
				this.$utils.jump('../login/login');
			},
			// 注册
			async update() {
				if((!this.ruleForm.yonghuming) && `xuesheng` == this.tableName){
					this.$utils.msg(`用户名不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `xuesheng` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if((!this.ruleForm.xingming) && `xuesheng` == this.tableName){
					this.$utils.msg(`姓名不能为空`);
					return
				}
				if(`xuesheng` == this.tableName && this.ruleForm.nianling&&(!this.$validate.isIntNumer(this.ruleForm.nianling))){
					this.$utils.msg(`年龄应输入整数`);
					return
				}
				if(`xuesheng` == this.tableName && this.ruleForm.shouji&&(!this.$validate.isMobile(this.ruleForm.shouji))){
					this.$utils.msg(`手机应输入手机格式`);
					return
				}
				if(`xuesheng` == this.tableName && this.ruleForm.youxiang&&(!this.$validate.isEmail(this.ruleForm.youxiang))){
					this.$utils.msg(`邮箱应输入邮件格式`);
					return
				}
				if((!this.ruleForm.maijiazhanghao) && `maijiayonghu` == this.tableName){
					this.$utils.msg(`卖家账号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `maijiayonghu` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if((!this.ruleForm.maijiaxingming) && `maijiayonghu` == this.tableName){
					this.$utils.msg(`卖家姓名不能为空`);
					return
				}
				if(`maijiayonghu` == this.tableName && this.ruleForm.maijiashouji&&(!this.$validate.isMobile(this.ruleForm.maijiashouji))){
					this.$utils.msg(`卖家手机应输入手机格式`);
					return
				}
				if(`maijiayonghu` == this.tableName && this.ruleForm.lianxiyouxiang&&(!this.$validate.isEmail(this.ruleForm.lianxiyouxiang))){
					this.$utils.msg(`联系邮箱应输入邮件格式`);
					return
				}
				let table = uni.getStorageSync("nowTable");
				await this.$api.update(table, this.ruleForm);
				this.$utils.msgBack('修改成功');;
			}

			,xueshengtouxiangTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.touxiang = _this.$base.url + 'upload/' + res.file;
					_this.$forceUpdate();
				});
			}
			,maijiayonghuzhaopianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.zhaopian = _this.$base.url + 'upload/' + res.file;
					_this.$forceUpdate();
				});
			}
		}
	}
</script>

<style lang="scss" scoped>
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
				background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	.avator {
		width: 110upx;
		height: 110upx;
		border-radius: 50%;
		margin-left: 30upx;
	}
	
	.cu-form-group.active {
		justify-content: space-between;
	}

	.cu-btn {
		width: 100%;
	}

	.right-input {
		flex: 1;
		text-align: left;
		line-height: 80rpx;
	}
	.btn {
	  display: flex;
	  align-items: center;
	  justify-content: center;
	  flex-wrap: wrap;
	  padding: 20upx 0;
	}
	
	.box {
	  width: auto;
	  padding: 0 10upx;
	  box-sizing: border-box;
	  margin-bottom: 20upx;
	}
	
	.cu-btn {
	  width: 100% !important;
	}

.picker-select-input {
	line-height: 80rpx;
}
</style>
