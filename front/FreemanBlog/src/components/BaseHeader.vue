<template>
  <el-header :style="headerStyle" ref="header">
    <el-row>
      <!--logo-->
      <el-col :span="2" :class="headerLogoCol" :style="headerLogoStyle">
        <router-link to="/" class="header-logo-router">
          <img src="../assets/logo.png" />
        </router-link>
      </el-col>
      <el-col :span="18" :class="headerMenuCol" :style="headerMenuStyle">
        <el-menu :router=true :mode="menuMode" :default-active="activeIndex">
          <el-menu-item index="/">首页</el-menu-item>
          <template v-if="modeBool">
            <el-menu-item index="/c1">文章分类</el-menu-item>
            <el-menu-item index="/c2">文章归档</el-menu-item>
            <el-menu-item index="/d1">标签</el-menu-item>
            <el-menu-item index="/d2">日志</el-menu-item>
            <el-menu-item index="/d3">留言板</el-menu-item>
            <el-menu-item index="/e" class="offset-5"><i class="el-icon-edit"></i>写文章</el-menu-item>
          </template>
          <template v-else>
            <el-submenu index="/x">
              <template slot="title">其他</template>
              <el-submenu index="/c">
                <template slot="title">文章</template>
                <el-menu-item index="/c1">文章分类</el-menu-item>
                <el-menu-item index="/c2">文章归档</el-menu-item>
              </el-submenu>
              <el-submenu index="/d">
                <template slot="title">记录</template>
                <el-menu-item index="/d1">标签</el-menu-item>
                <el-menu-item index="/d2">日志</el-menu-item>
                <el-menu-item index="/d3">留言板</el-menu-item>
              </el-submenu>
              <el-menu-item index="/e"><i class="el-icon-edit"></i>写文章</el-menu-item>
            </el-submenu>
          </template>
        </el-menu>
      </el-col>
      <el-col :span="4" :class="headerLoginCol" :style="headerLoginStyle">
        <el-menu menu-trigger="click" :mode="menuMode" :router=true>
          <template v-if="modeBool">
            <el-menu-item index="/f1">
              <el-button type="text">登录</el-button>
            </el-menu-item>
            <el-menu-item index="/f2">
              <el-button type="text">注册</el-button>
            </el-menu-item>
          </template>
          <template v-else>
            <el-submenu  index="/f1">
              <template slot="title">用户</template>
              <el-menu-item index="/f1">
                <el-button type="text">登录</el-button>
              </el-menu-item>
              <el-menu-item index="/f2">
                <el-button type="text">注册</el-button>
              </el-menu-item>
            </el-submenu>
          </template>
        </el-menu>
      </el-col>
    </el-row>
  </el-header>

</template>
<script>
export default{
  name:'BaseHeader',
  props:{
    activeIndex:String,
  },
  data(){
    return {
      menuMode:'horizontal',
      screenWidth:document.documentElement.clientWidth,
      //移动端和桌面端布局变化
      criticalVal:this.GLOBAL.MOBILEVAL,
      //导航栏不再变动
      fixedVal:this.GLOBAL.FIXEDVAL,
      headerStyle:{
        //@为什么这里不写width,就会有bug?
        //width:'100%'
      },
      headerLogoStyle:{

      },
      headerMenuStyle:{

      },
      headerLoginStyle:{

      },
      headerLogoCol:{
        'header-logo-col-hide':false,
        'header-logo-col-bgc':true
      },
      headerMenuCol:{
        'w-100':false
      },
      headerLoginCol:{
        'w-100':false
      }
    }
  },
  methods:{
    updateNavBar:function(){
      this.screenWidth = document.documentElement.clientWidth
      if(this.screenWidth>this.fixedVal){
        this.menuMode='horizontal'
        this.headerLogoCol['header-logo-col-hide'] = false
        this.headerMenuCol['w-100'] = false
        this.headerLoginCol['w-100'] = false
        //this.headerStyle.width='100%'

      }else if(this.screenWidth>this.criticalVal){
        this.menuMode='horizontal'
        this.headerLogoCol['header-logo-col-hide'] = false
        this.headerMenuCol['w-100'] = false
        this.headerLoginCol['w-100'] = false
        //this.headerStyle.width='880px'

      }else{
        this.menuMode='vertical'
        this.headerLogoCol['header-logo-col-hide'] = true
        this.headerMenuCol['w-100'] = true
        this.headerLoginCol['w-100'] = true
        //this.headerStyle.width='100%'
      }
    }
  },
  mounted () {
    window.addEventListener('resize',this.updateNavBar);
    window.addEventListener('load',this.updateNavBar);
  },
  computed: {
    modeBool: function(){
      if(this.menuMode == 'horizontal'){
        return true;
      }else{
        return false;
      }
    }
  }
}

</script>

<style scoped>
.header-logo-col-bgc{
  background: #ffffff;
}
.el-header{

  padding-left: 0 !important;
  padding-right: 0 !important;
  box-shadow: 0 2px 12px 0 rgba(0, 0, 0, 0.1);
  text-align: center;
}
.header-logo-router{
  /*logo居中？ */
  margin-left: 16px;
  display: block;
  float: left;
  height: 56px;
  padding-top: 2px;
  padding-bottom: 2px;
}
.header-logo-router img{

  /*存疑：为什么height设置60px,header会多4px?*/
  height: inherit;
  width:auto;
  max-width: 100%;
}
.header-logo-col-hide{
  display: none !important;
}
.w-100{
  width: 100% !important;
}
</style>
<style>
.el-submenu__title{
  padding: 0 20px !important;
}
.el-submenu .el-menu-item{
  padding:0 20px !important;
}

</style>
