<template>
  <div id="app" ref="app">
    <router-view/>
  </div>
</template>

<script>
import HelloWorld from './components/HelloWorld'

export default {
  name: 'App',
  components: {
  },
  mounted () {
    window.addEventListener('load',this.updateBodyWidth)
    window.addEventListener('resize',this.updateBodyWidth)
},
  methods:{
    updateBodyWidth(){
      this.screenWidth = document.documentElement.clientWidth
      if(this.screenWidth>this.GLOBAL.FIXEDVAL){
        this.$refs.app.style.width = "100%";
      }else if(this.screenWidth>this.GLOBAL.MOBILEVAL){
        this.$refs.app.style.width ='880px'

      }else{
        this.$refs.app.style.width = "100%";
      }
    }
  }
}
</script>

<style>
  html{
    height: 100%;
  }
  body{
    position: relative;
    min-height: 100%;
    margin: 0;
    padding: 0;
    background: #f6f6f6;

    font-family: -apple-system,BlinkMacSystemFont,Helvetica Neue,PingFang SC,Microsoft YaHei,Source Han Sans SC,Noto Sans CJK SC,WenQuanYi Micro Hei,sans-serif;
    font-size: 15px;
    color: #121212;

    box-sizing: border-box;

}


  .clearfix{
    clear: both;
  }
  .float-right{
    float: right;
  }
  .float-left{
    float: left;
  }
  .offset-3{
    margin-left: 6% !important;
  }
  .offset-4{
    margin-left: 8% !important;
  }

  .offset-5{
    margin-left: 10% !important;
  }

  @media screen and (max-width: 1260px){
    .offset-3,.offset-4,.offset-5{
      margin-left: 0 !important;
   }
  }
  .box-shadow{
      box-shadow: 0 2px 12px 0 rgba(0, 0, 0, 0.1);
  }

</style>
