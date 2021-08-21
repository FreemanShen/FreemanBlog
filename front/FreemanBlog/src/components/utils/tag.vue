<template>
  <div>
    {{val}}
  </div>
</template>
<script>
export default{
props:{
  val:{
    type:String
  }
}
}
</script>
<style scoped>
div{
  display: inline-block;
  color: #06f;
  border-radius: 100px;
  font-size: 14px;
  padding:0 12px;
  display: inline-block;
  height: 30px;
  line-height: 30px;
  background-color: rgba(0,102,255,.1);
}
</style>
