// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
//import store from './store'
import router from './router'
import lodash from 'lodash'
import ElementUI from 'element-ui'
import App from '@/App'
import 'element-ui/lib/theme-chalk/index.css'
import "./assets/icon/iconfont.css"
import "./assets/color/color.css"
import global_ from "./global/Global"
import api from '@/api'

Vue.config.productionTip = false
Vue.prototype.GLOBAL = global_
Vue.prototype.api = api
Vue.use(ElementUI)

Vue.directive('title',(el,binding)=>{
  document.title = el.dataset.title;
})
/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
 //store,
  components: { App },
  template: '<App/>'
})
