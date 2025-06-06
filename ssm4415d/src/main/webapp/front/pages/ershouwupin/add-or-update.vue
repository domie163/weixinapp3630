<template>
	<view class="content">
		<form class="app-update-pv">
			
									<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(245, 245, 245, 1)","borderColor":"rgba(245, 245, 245, 1)","margin":"0","borderWidth":"0 ","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"25%","fontSize":"26rpx","color":"rgba(51, 51, 51, 1)","textAlign":"center"}' class="title">物品名称</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' :disabled="ro.wupinmingcheng" v-model="ruleForm.wupinmingcheng" placeholder="物品名称"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(245, 245, 245, 1)","borderColor":"rgba(245, 245, 245, 1)","margin":"0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group select">
				<view :style='{"width":"25%","fontSize":"26rpx","color":"rgba(68, 68, 68, 1)","textAlign":"center"}' class="title">物品分类</view>
				<picker @change="wupinfenleiChange" :value="wupinfenleiIndex" :range="wupinfenleiOptions">
					<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' class="uni-input">{{ruleForm.wupinfenlei?ruleForm.wupinfenlei:"请选择物品分类"}}</view>
				</picker>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(245, 245, 245, 1)","borderColor":"#ccc","margin":"0 0 20rpx 0","borderWidth":"0","borderStyle":"solid","height":"160rpx"}' class="cu-form-group" @tap="tupianTap" :class='left == "left"?"":"active"'>
				<view :style='{"width":"25%","fontSize":"26rpx","color":"rgba(51, 51, 51, 1)","textAlign":"center"}' class="title">图片</view>
				<view class="right-input" :style='{textAlign:"left"}' style="padding:0">
					<image :style='{"width":"120rpx","boxShadow":"0 0 8rpx rgba(0,0,0,.3)","borderRadius":"50%","textAlign":"left","height":"120rpx"}' class="avator" v-if="ruleForm.tupian" :src="ruleForm.tupian" mode="aspectFill"></image>
					<image :style='{"width":"120rpx","boxShadow":"0 0 8rpx rgba(0,0,0,.3)","borderRadius":"50%","textAlign":"left","height":"120rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
				</view>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(245, 245, 245, 1)","borderColor":"rgba(245, 245, 245, 1)","margin":"0","borderWidth":"0 ","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"25%","fontSize":"26rpx","color":"rgba(51, 51, 51, 1)","textAlign":"center"}' class="title">规格</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' :disabled="ro.guige" v-model="ruleForm.guige" placeholder="规格"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(245, 245, 245, 1)","borderColor":"rgba(245, 245, 245, 1)","margin":"0","borderWidth":"0 ","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"25%","fontSize":"26rpx","color":"rgba(51, 51, 51, 1)","textAlign":"center"}' class="title">新旧程度</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' :disabled="ro.xinjiuchengdu" v-model="ruleForm.xinjiuchengdu" placeholder="新旧程度"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(245, 245, 245, 1)","borderColor":"rgba(245, 245, 245, 1)","margin":"0","borderWidth":"0 ","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"25%","fontSize":"26rpx","color":"rgba(51, 51, 51, 1)","textAlign":"center"}' class="title">原价</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' :disabled="ro.yuanjia" v-model="ruleForm.yuanjia" placeholder="原价"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(245, 245, 245, 1)","borderColor":"rgba(245, 245, 245, 1)","margin":"0","borderWidth":"0 ","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"25%","fontSize":"26rpx","color":"rgba(51, 51, 51, 1)","textAlign":"center"}' class="title">二手价</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' :disabled="ro.ershoujia" v-model="ruleForm.ershoujia" placeholder="二手价"></input>
			</view>
																					<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(245, 245, 245, 1)","borderColor":"rgba(245, 245, 245, 1)","margin":"0","borderWidth":"0 ","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"25%","fontSize":"26rpx","color":"rgba(51, 51, 51, 1)","textAlign":"center"}' class="title">备注</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' :disabled="ro.beizhu" v-model="ruleForm.beizhu" placeholder="备注"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(245, 245, 245, 1)","borderColor":"rgba(245, 245, 245, 1)","margin":"0","borderWidth":"0 ","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"25%","fontSize":"26rpx","color":"rgba(51, 51, 51, 1)","textAlign":"center"}' class="title">卖家账号</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' :disabled="ro.maijiazhanghao" v-model="ruleForm.maijiazhanghao" placeholder="卖家账号"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(245, 245, 245, 1)","borderColor":"rgba(245, 245, 245, 1)","margin":"0","borderWidth":"0 ","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"25%","fontSize":"26rpx","color":"rgba(51, 51, 51, 1)","textAlign":"center"}' class="title">卖家姓名</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' :disabled="ro.maijiaxingming" v-model="ruleForm.maijiaxingming" placeholder="卖家姓名"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(245, 245, 245, 1)","borderColor":"rgba(245, 245, 245, 1)","margin":"0","borderWidth":"0 ","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"25%","fontSize":"26rpx","color":"rgba(51, 51, 51, 1)","textAlign":"center"}' class="title">卖家手机</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' :disabled="ro.maijiashouji" v-model="ruleForm.maijiashouji" placeholder="卖家手机"></input>
			</view>
																																				
			<!-- 否 -->
 
			
			          				          				          				          				          				          				          				          				          				          				          				          				          				          				          							
			          				          				          				          				          				          				          				          				<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(245, 245, 245, 1)","borderColor":"rgba(245, 245, 245, 1)","margin":"0 0 0 0","borderWidth":"0","borderStyle":"solid","height":"308rpx"}' class="cu-form-group">
				<view :style='{"width":"25%","fontSize":"26rpx","color":"rgba(51, 51, 51, 1)","textAlign":"center"}' class="title">商品描述</view>
				<textarea :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"280rpx"}' v-model="ruleForm.shangpinmiaoshu" placeholder="商品描述"></textarea>
			</view>
						          				          				          				          				          				          				          							
			<view class="btn">
				<button :style='{"boxShadow":"0 0 0px rgba(0,0,0,0) inset","backgroundColor":"rgba(26, 172, 25, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"8rpx","color":"#fff","borderWidth":"0","width":"90%","fontSize":"32rpx","borderStyle":"solid","height":"80rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

																																																						<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="clicktimeConfirm" ref="clicktime" themeColor="#333333"></w-picker>
															
	</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";

	export default {
		data() {
			return {
				ruleForm: {
												wupinmingcheng: '',
																wupinfenlei: '',
																tupian: '',
																guige: '',
																xinjiuchengdu: '',
																yuanjia: '',
																ershoujia: '',
																shangpinmiaoshu: '',
																beizhu: '',
																maijiazhanghao: '',
																maijiaxingming: '',
																maijiashouji: '',
																clicktime: '',
																clicknum: '',
																userid: '',
												},
																				wupinfenleiOptions: [],
				wupinfenleiIndex: 0,
																																																																																																																				// 登陆用户信息
				user: {},
                                ro:{
                                   wupinmingcheng : false,
                                   wupinfenlei : false,
                                   tupian : false,
                                   guige : false,
                                   xinjiuchengdu : false,
                                   yuanjia : false,
                                   ershoujia : false,
                                   shangpinmiaoshu : false,
                                   beizhu : false,
                                   maijiazhanghao : false,
                                   maijiaxingming : false,
                                   maijiashouji : false,
                                   clicktime : false,
                                   clicknum : false,
                                   userid : false,
                                },
			}
		},
		components: {
			wPicker
		},
		computed: {
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
					},
		async onLoad(options) {
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
						// ss读取
																																																															this.ruleForm.maijiazhanghao = this.user.maijiazhanghao
												this.ruleForm.maijiaxingming = this.user.maijiaxingming
												this.ruleForm.maijiashouji = this.user.maijiashouji
																											
																		// 下拉框
			res = await this.$api.option(`wupinfenlei`,`wupinfenlei`,{});
			this.wupinfenleiOptions = res.data;
																																																																																							
			// 如果有登陆，获取登陆后保存的userid
			this.ruleForm.userid = uni.getStorageSync("userid")
			if (options.refid) {
				// 如果上一级页面传递了refid，获取改refid数据信息
				this.ruleForm.refid = options.refid;
				this.ruleForm.nickname = uni.getStorageSync("nickname");
			}
			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				res = await this.$api.info(`ershouwupin`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='wupinmingcheng'){
					this.ruleForm.wupinmingcheng = obj[o];
					this.ro.wupinmingcheng = true;
					continue;
					}
					if(o=='wupinfenlei'){
					this.ruleForm.wupinfenlei = obj[o];
					this.ro.wupinfenlei = true;
					continue;
					}
					if(o=='tupian'){
					this.ruleForm.tupian = obj[o];
					this.ro.tupian = true;
					continue;
					}
					if(o=='guige'){
					this.ruleForm.guige = obj[o];
					this.ro.guige = true;
					continue;
					}
					if(o=='xinjiuchengdu'){
					this.ruleForm.xinjiuchengdu = obj[o];
					this.ro.xinjiuchengdu = true;
					continue;
					}
					if(o=='yuanjia'){
					this.ruleForm.yuanjia = obj[o];
					this.ro.yuanjia = true;
					continue;
					}
					if(o=='ershoujia'){
					this.ruleForm.ershoujia = obj[o];
					this.ro.ershoujia = true;
					continue;
					}
					if(o=='shangpinmiaoshu'){
					this.ruleForm.shangpinmiaoshu = obj[o];
					this.ro.shangpinmiaoshu = true;
					continue;
					}
					if(o=='beizhu'){
					this.ruleForm.beizhu = obj[o];
					this.ro.beizhu = true;
					continue;
					}
					if(o=='maijiazhanghao'){
					this.ruleForm.maijiazhanghao = obj[o];
					this.ro.maijiazhanghao = true;
					continue;
					}
					if(o=='maijiaxingming'){
					this.ruleForm.maijiaxingming = obj[o];
					this.ro.maijiaxingming = true;
					continue;
					}
					if(o=='maijiashouji'){
					this.ruleForm.maijiashouji = obj[o];
					this.ro.maijiashouji = true;
					continue;
					}
					if(o=='clicktime'){
					this.ruleForm.clicktime = obj[o];
					this.ro.clicktime = true;
					continue;
					}
					if(o=='clicknum'){
					this.ruleForm.clicknum = obj[o];
					this.ro.clicknum = true;
					continue;
					}
					if(o=='userid'){
					this.ruleForm.userid = obj[o];
					this.ro.userid = true;
					continue;
					}
				}
			}
			this.styleChange()
		},
		methods: {
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv .cu-form-group .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},
																																																																																																
			// 多级联动参数
																																																																																																
																																																																																													
																																																																																	// 日长控件选择日期时间
			clicktimeConfirm(val) {
				console.log(val)
				this.ruleForm.clicktime = val.result;
				this.$forceUpdate();
			},
																		
															// 下拉变化
			wupinfenleiChange(e) {
				this.wupinfenleiIndex = e.target.value
				this.ruleForm.wupinfenlei = this.wupinfenleiOptions[this.wupinfenleiIndex]
			},
																																																																																				
																											tupianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.tupian = _this.$base.url + 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(()=>{
						_this.styleChange()
					})
				});
			},
																																																																																																																					
			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																if(this.ruleForm.yuanjia&&(!this.$validate.isIntNumer(this.ruleForm.yuanjia))){
					this.$utils.msg(`原价应输入整数`);
					return
				}
																																												if(this.ruleForm.ershoujia&&(!this.$validate.isIntNumer(this.ruleForm.ershoujia))){
					this.$utils.msg(`二手价应输入整数`);
					return
				}
																																																																																																																																																																																																																																																																				if(this.ruleForm.clicknum&&(!this.$validate.isIntNumer(this.ruleForm.clicknum))){
					this.$utils.msg(`点击次数应输入整数`);
					return
				}
																																																																								if(this.ruleForm.id){
					await this.$api.update(`ershouwupin`, this.ruleForm);
				}else{
					await this.$api.add(`ershouwupin`, this.ruleForm);
				}
				this.$utils.msgBack('提交成功');
			},
			optionsChange(e) {
				this.index = e.target.value
			},
			bindDateChange(e) {
				this.date = e.target.value
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
			}
		}
	}
</script>

<style lang="scss" scoped>
	.container {
		padding: 20upx;
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

	textarea {
		border: 1upx solid #EEEEEE;
		border-radius: 20upx;
		padding: 20upx;
	}

	.title {
		width: 180upx;
	}

	.avator {
		width: 150upx;
		height: 60upx;
	}

	.right-input {
		flex: 1;
		text-align: left;
		padding: 0 24upx;
	}
	
	.cu-form-group.active {
		justify-content: space-between;
	}
	
	.btn {
	  display: flex;
	  align-items: center;
	  justify-content: center;
	  flex-wrap: wrap;
	  padding: 20upx 0;
	}
	
	.cu-form-group {
		padding: 0 24upx;
		background-color: transparent;
		min-height: inherit;
	}
	
	.cu-form-group+.cu-form-group {
		border: 0;
	}
	
	.cu-form-group uni-input {
		padding: 0 30upx;
	}
	
	.uni-input {
		padding: 0 30upx;
	}
	
	.cu-form-group uni-textarea {
		padding: 30upx;
		margin: 0;
	}
	
	.cu-form-group uni-picker::after {
		line-height: 80rpx;
	}
	
	.select .uni-input {
		line-height: 80rpx;
	}
	
	.input .right-input {
		line-height: 80rpx;
	}
</style>
