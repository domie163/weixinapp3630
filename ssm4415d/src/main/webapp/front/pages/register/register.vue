<template>
	<view class="content">
		<view class="logo" v-if="true">
			<image :style='{"boxShadow":"0 0 8rpx #444","borderColor":"#ccc","borderRadius":"40rpx","borderWidth":"0px","width":"160rpx","borderStyle":"solid","url":"http://codegen.caihongy.cn/20210329/bbef90178a8540a898c5dc6ce123859b.png","isShow":true,"height":"160rpx"}' src='http://codegen.caihongy.cn/20210329/bbef90178a8540a898c5dc6ce123859b.png' mode="aspectFill"></image>
		</view>
		<view v-if="tableName=='xuesheng'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(0, 0, 0, 0.6)","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"8rpx","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.yonghuming" type="text" class="uni-input" name="" placeholder="用户名" />
		</view>
		<view v-if="tableName=='xuesheng'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(0, 0, 0, 0.6)","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"8rpx","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.mima" type="text" class="uni-input" name="" placeholder="密码" />
		</view>
		<view v-if="tableName=='xuesheng'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(0, 0, 0, 0.6)","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"8rpx","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.xingming" type="text" class="uni-input" name="" placeholder="姓名" />
		</view>
		<view v-if="tableName=='xuesheng'" class="uni-form-item uni-column">
                        <picker @change="xueshengxingbieChange" :value="xueshengxingbieIndex" :range="xueshengxingbieOptions">
                                <view :style='{"borderColor":"rgba(0, 0, 0, 0.6)","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"8rpx","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
                        </picker>
                </view>
		<view v-if="tableName=='xuesheng'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(0, 0, 0, 0.6)","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"8rpx","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.nianling" type="text" class="uni-input" name="" placeholder="年龄" />
		</view>
		<view v-if="tableName=='xuesheng'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(0, 0, 0, 0.6)","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"8rpx","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.shouji" type="text" class="uni-input" name="" placeholder="手机" />
		</view>
		<view v-if="tableName=='xuesheng'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(0, 0, 0, 0.6)","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"8rpx","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.youxiang" type="text" class="uni-input" name="" placeholder="邮箱" />
		</view>
		<view v-if="tableName=='maijiayonghu'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(0, 0, 0, 0.6)","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"8rpx","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.maijiazhanghao" type="text" class="uni-input" name="" placeholder="卖家账号" />
		</view>
		<view v-if="tableName=='maijiayonghu'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(0, 0, 0, 0.6)","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"8rpx","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.mima" type="text" class="uni-input" name="" placeholder="密码" />
		</view>
		<view v-if="tableName=='maijiayonghu'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(0, 0, 0, 0.6)","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"8rpx","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.maijiaxingming" type="text" class="uni-input" name="" placeholder="卖家姓名" />
		</view>
		<view v-if="tableName=='maijiayonghu'" class="uni-form-item uni-column">
                        <picker @change="maijiayonghuxingbieChange" :value="maijiayonghuxingbieIndex" :range="maijiayonghuxingbieOptions">
                                <view :style='{"borderColor":"rgba(0, 0, 0, 0.6)","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"8rpx","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
                        </picker>
                </view>
		<view v-if="tableName=='maijiayonghu'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(0, 0, 0, 0.6)","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"8rpx","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.xuehao" type="text" class="uni-input" name="" placeholder="学号" />
		</view>
		<view v-if="tableName=='maijiayonghu'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(0, 0, 0, 0.6)","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"8rpx","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.xuexiao" type="text" class="uni-input" name="" placeholder="学校" />
		</view>
		<view v-if="tableName=='maijiayonghu'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(0, 0, 0, 0.6)","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"8rpx","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.maijiashouji" type="text" class="uni-input" name="" placeholder="卖家手机" />
		</view>
		<view v-if="tableName=='maijiayonghu'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(0, 0, 0, 0.6)","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"8rpx","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.lianxiyouxiang" type="text" class="uni-input" name="" placeholder="联系邮箱" />
		</view>
		<view>
			<button @tap="register" type="primary" :style='{"borderColor":"rgba(68, 68, 68, 1)","backgroundColor":"rgba(26, 172, 25, 1)","borderRadius":"8rpx","color":"rgba(255, 255, 255, 1)","borderWidth":"0","fontSize":"32rpx","borderStyle":"solid","height":"88rpx"}'>注册</button>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
                                xueshengxingbieOptions: [],
                                xueshengxingbieIndex: 0,
                                maijiayonghuxingbieOptions: [],
                                maijiayonghuxingbieIndex: 0,
				ruleForm: {
				},
				tableName:""
			}
		},
		async onLoad() {
			let res = [];
			let table = uni.getStorageSync("loginTable");
	    		this.tableName = table;

                        // 自定义下拉框值
			if(this.tableName=='xuesheng'){
                        	this.xueshengxingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.xueshengxingbieOptions[0]
			}
                        // 自定义下拉框值
			if(this.tableName=='maijiayonghu'){
                        	this.maijiayonghuxingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.maijiayonghuxingbieOptions[0]
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
					// document.querySelectorAll('.uni-input .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.registerFrom.content.input.backgroundColor
					// })
				})
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			// 注册
			async register() {
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
				await this.$api.register(`${this.tableName}`, this.ruleForm);
				this.$utils.msgBack('注册成功');;
			}
		}
	}
</script>

<style lang="scss" scoped>
	$color-primary: #b49950;

	.content {
		padding: 100upx;
	}
	
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

	.logo {
		text-align: center;

		image {
			height: 200upx;
			width: 200upx;
			margin: 0 0 60upx;
		}
	}

	.uni-form-item {
		margin-bottom: 40upx;
		padding: 0;

		.uni-input {
			font-size: 30upx;
			padding: 7px 0;
		}
	}

	button[type="primary"] {
		background-color: $color-primary;
		border-radius: 0;
		font-size: 34upx;
		margin-top: 60upx;
	}

	.links {
		text-align: center;
		margin-top: 40upx;
		font-size: 26upx;
		color: #999;

		view {
			display: inline-block;
			vertical-align: top;
			margin: 0 10upx;
		}

		.link-highlight {
			color: $color-primary
		}
	}
.picker-select-input {
	line-height: 80rpx;
}

</style>
