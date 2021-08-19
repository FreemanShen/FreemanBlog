<template>
  <div id="app">
    <router-view/>
  </div>
  <!-- <div id="app">
    <h1>布局1</h1>
  <el-container>
    <el-header>Header</el-header>
    <el-main>Main</el-main>
  </el-container>
  </div> -->
</template>

<script>
import HelloWorld from './components/HelloWorld'

export default {
  name: 'App',
  components: {
  }
}
</script>

<style>

  #app{
    text-align: center;
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


</style>
