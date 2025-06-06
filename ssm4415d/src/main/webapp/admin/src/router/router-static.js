import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import wupinfenlei from '@/views/modules/wupinfenlei/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import goumaidingdan from '@/views/modules/goumaidingdan/list'
    import discussjianzhixinxi from '@/views/modules/discussjianzhixinxi/list'
    import jianzhixinxi from '@/views/modules/jianzhixinxi/list'
    import ershouwupin from '@/views/modules/ershouwupin/list'
    import maijiayonghu from '@/views/modules/maijiayonghu/list'
    import discussershouwupin from '@/views/modules/discussershouwupin/list'
    import storeup from '@/views/modules/storeup/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '校园资讯',
        component: news
      }
      ,{
	path: '/wupinfenlei',
        name: '物品分类',
        component: wupinfenlei
      }
      ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
      ,{
	path: '/goumaidingdan',
        name: '购买订单',
        component: goumaidingdan
      }
      ,{
	path: '/discussjianzhixinxi',
        name: '兼职信息评论',
        component: discussjianzhixinxi
      }
      ,{
	path: '/jianzhixinxi',
        name: '兼职信息',
        component: jianzhixinxi
      }
      ,{
	path: '/ershouwupin',
        name: '二手物品',
        component: ershouwupin
      }
      ,{
	path: '/maijiayonghu',
        name: '卖家用户',
        component: maijiayonghu
      }
      ,{
	path: '/discussershouwupin',
        name: '二手物品评论',
        component: discussershouwupin
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
