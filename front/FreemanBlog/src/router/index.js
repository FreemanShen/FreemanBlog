import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/views/Home'

import {Message} from 'element-ui'

//import store from '@/store'


Vue.use(Router)

const router = new Router({
  routes:[
    {
      path:'',
      name:'Home',
      component:Home,
      children:[
        {
          path:'/',
          component: r=> require.ensure([],()=>r(require('@/views/Index')))
        }
      ]
    }
  ]
})
export default router
