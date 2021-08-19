<template>
  <scroll-page :loading="loading" :no-data="noData">
    <article-item v-for="article in articles" :key="article.id" v-bind="a"></article-item>
  </scroll-page>
</template>
<script>

import ScrollPage from './ScrollPage'
import ArticleItem from './ArticleItem'
export default{
  components: { ScrollPage,ArticleItem },
  name:'ArticleScrollPage',
  data(){
    return{
      loading:true,
      noData:true,
      articles:[]
    }
  },
  methods:{
    //@Todo:获取文章。。。
  }
}
</script>
