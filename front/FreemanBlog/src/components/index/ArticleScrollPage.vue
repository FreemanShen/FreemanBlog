<template>
  <scroll-page :loading="loading" :no-data="noData">
    <article-item v-for="article in articles" :key="article.id" v-bind="article"></article-item>
  </scroll-page>
</template>
<script>

import ScrollPage from './ScrollPage'
import ArticleItem from './ArticleItem'
var article=[
  {
    id:1,
    weight:0,
    title:'满江红',
    commentCounts:25,
    viewCounts:25,
    summary:`
    怒发冲冠，凭栏处潇潇雨歇。
    抬望眼，仰天长啸，壮怀激烈。
    三十功名尘与土，
    八千里路云和月。
    莫等闲白了少年头，空悲切。
    靖康耻，犹未雪；
    臣子恨，何时灭！
    驾长车踏破贺兰山缺。
    壮志饥餐胡虏肉，
    笑谈渴饮匈奴血。
    待从头收拾旧山河，朝天阙。`,
    author:{nickname:'岳飞'},
    tags:['大英雄','爱国诗人'],
    createDate:'2021-8-19'
  },
  {
    id:2,
    weight:0,
    title:'滕王阁序',
    commentCounts:35,
    viewCounts:35,
    summary:'豫章故郡，洪都新府。星分翼轸，地接衡庐。襟三江而带五湖，控蛮荆而引瓯越。物华天宝，龙光射牛斗之墟；人杰地灵，徐孺下陈蕃之榻。雄州雾列，俊采星驰。台隍枕夷夏之交，宾主尽东南之美。都督阎公之雅望，棨戟遥临；宇文新州之懿范，襜帷暂驻。十旬休假，胜友如云；千里逢迎，高朋满座。腾蛟起凤，孟学士之词宗；紫电青霜，王将军之武库。家君作宰，路出名区；童子何知，躬逢胜饯',
    author:{nickname:'王勃'},
    tags:['南昌','秋水广场'],
    createDate:'2021-8-19'
  }
]


export default{
  components: { ScrollPage,ArticleItem },
  name:'ArticleScrollPage',
  data(){
    return{
      loading:true,
      noData:true,
      articles:article
    }
  },
  methods:{
    //@Todo:获取文章。。。
  },
  mounted(){
    //console.log(article);
    this.api.article.getArticleData().then(response =>{
      console.log("response: "+response.data);
      this.articles = response.data
      console.log(this.articles);
    })
  }
}
</script>
<style scoped>

</style>
