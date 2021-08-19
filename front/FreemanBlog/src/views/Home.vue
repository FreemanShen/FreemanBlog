<template>
  <div id="home">
    <el-container direction="vertical">
      <base-header :activeIndex="activeIndex"></base-header>
      <router-view></router-view>
      <base-footer></base-footer>

    </el-container>
  </div>
</template>
<script>
import BaseHeader from '@/components/BaseHeader'
import BaseFooter from '@/components/BaseFooter'

export default{
  name:'Home',
  components:{
    BaseHeader,
    BaseFooter
  },
  data(){
    return{
      activeIndex:'/'
    }
  },


}
</script>
