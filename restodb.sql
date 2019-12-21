-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 04, 2018 at 04:23 PM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `restodb`
--

-- --------------------------------------------------------

--
-- Table structure for table `cheftable`
--

CREATE TABLE `cheftable` (
  `chefid` int(11) NOT NULL,
  `chefname` varchar(255) NOT NULL,
  `gender` varchar(255) NOT NULL,
  `contactno` int(10) NOT NULL,
  `specialization` varchar(255) NOT NULL,
  `address` text NOT NULL,
  `photo` longblob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cheftable`
--

INSERT INTO `cheftable` (`chefid`, `chefname`, `gender`, `contactno`, `specialization`, `address`, `photo`) VALUES
(1, 'nikhil nagdev', 'Male', 848587464, 'Item 2', 'ulhasnagar', 0xffd8ffe000104a46494600010200000100010000ffdb004300080606070605080707070909080a0c140d0c0b0b0c1912130f141d1a1f1e1d1a1c1c20242e2720222c231c1c2837292c30313434341f27393d38323c2e333432ffdb0043010909090c0b0c180d0d1832211c213232323232323232323232323232323232323232323232323232323232323232323232323232323232323232323232323232ffc000110800b400b403012200021101031101ffc4001f0000010501010101010100000000000000000102030405060708090a0bffc400b5100002010303020403050504040000017d01020300041105122131410613516107227114328191a1082342b1c11552d1f02433627282090a161718191a25262728292a3435363738393a434445464748494a535455565758595a636465666768696a737475767778797a838485868788898a92939495969798999aa2a3a4a5a6a7a8a9aab2b3b4b5b6b7b8b9bac2c3c4c5c6c7c8c9cad2d3d4d5d6d7d8d9dae1e2e3e4e5e6e7e8e9eaf1f2f3f4f5f6f7f8f9faffc4001f0100030101010101010101010000000000000102030405060708090a0bffc400b51100020102040403040705040400010277000102031104052131061241510761711322328108144291a1b1c109233352f0156272d10a162434e125f11718191a262728292a35363738393a434445464748494a535455565758595a636465666768696a737475767778797a82838485868788898a92939495969798999aa2a3a4a5a6a7a8a9aab2b3b4b5b6b7b8b9bac2c3c4c5c6c7c8c9cad2d3d4d5d6d7d8d9dae2e3e4e5e6e7e8e9eaf2f3f4f5f6f7f8f9faffda000c03010002110311003f00f9fe8a28a0028a28a0028a28a0028a2bbcf86de118f5bbd7d4afa32d656cc02211f2cb27a1f503fa8a0cead58d2839c883c2df0e351d7634bbbc636562dca965cc920f555f4f73f866bd334df87de1bd3635034f5b8907592e0ef27f0e9fa574fd060515939b3c3ab8bab51ef65e456874fb2b65db059dbc43d12255fe42ac322b8c3a861e8466968a9b9cd7665ddf87344be56173a559bee392de4a8627ea39ae375cf84da7dcacb36913bdacc4656190ee8c9f4cf51fafd2bd1a8a6a4d1ad3af529bbc59f32eaba45f6897cf677f034532f383c861ea0f71546be8bf15f86adbc4da4496d2285b9405a09b1ca37619f43dc57cf5776b2d95dcd6b3a14961728ea7b10715aa773dac2e25568f9a21a28a299d41451450014514500145145001451450014514500145145000064e057d25e1ad29745f0e58d885c34710327fbe796fd49af00f0eda0bef12e996c5772c9731861fecee19fd335f4ad44d9e56653f861f30a28a2b33ca0a28a2800a28a2800af16f8b1a50b4f11437f1ae12f22f9ce7f8d783fa6daf69af3ff8bb6be6f866d6e00cb4374013e8acad9fd40aa8bd4ebc14f96b2f33c5e8a28ad4f7c28a28a0028a28a0028a28a0028a28a0028a28a0028a28a00eabe1c4624f1e69db8642f98df946d8af7eaf06f8658ff84eacff00dc97ff004035ef359cf73c5ccbf8abd3f5614514541e785145140051451400572df1162597c09a96472a2361ec43ad7535cd7c41ff00911754ff00713ff435a71dd1ad176a917e68f9f28a28ad8fa50a28a2800a28a2800a28a2800a28a2800a28a2800a28a2803a1f035e2d878d74b99beeb4be51cffb60a7fecd5f43d7cb50caf04f1cd19c3c6c194fa10722be9bd36fe1d534cb6bfb7398a78c3afb67b1f71d2b399e4e650d633f916a8a28a83cb0a28a2800a28a2800ae37e285e8b5f04cf1f7b9963847e7bff921aecabc97e2feaab25dd8e94873e5299e4c7a9e00fc81fceaa2b53a7090e7ad13cc68a28ad4fa10a28a2800a28a2800a28a2800a28a2800a28a2800a28a2800af5bf84fe2212dacba0dc4803c5992db27965272cbf81e7f13e95e4953d9de4f61790dddb48639e160e8c3b1149aba31af4556838b3ea1a2b9df08f8b2d3c51a7075654bd8c013c1dc1fef0ff64fe9d2ba2ac5ab1f3b384a127192d428a28a090a28a6bba471b49232aa2825998e0003b9a008350be834cd3e7bdb97090c085d8938e9dbea7a57ce1adea92eb5acdd6a1313ba690b019ced5ec3f01815d57c42f1a8d7ae3fb36c1cff006742d966ff009ece33cffbbe9f9fa570b5ac6363dbc161dd38f34b7614514551de14514500145145001451450014514500145145001451450014559b3d3af750904765693dc3fa45196fe55d4da7c2ff00135ced325bc16c0f79a61c7d76e4d1b19ceac21f13b1cb58dfdd699791ddd94ef05c4672ae8791fe23dabd57c3df162d2754835c88dbcb8c1b8894943f55ea3f0cfe154a3f83927d8d8cbabafdab61da8b0fc81bb65b3923f0af3ed6344d4342bd6b5d42d9e271f758f2ae3b107a1a9d19cf2fabe2b4bea8fa2ac75ad335303ec3a85b5c1233b639016fcba8ab92491c31b492baa228c9663803f1af9668c93d4d2e439de58afa4bf03e81d5bc7fe1dd2637cdfa5d4a3a456a7cc24fd4703f135e57e2bf1f6a3e24df6d18fb2e9e4ffa953cbf3fc67bfd3a5724064e05775e17f8697fad406eb5077b0b664cc594cbb9ec769e83ebd7f5a6928ea6d1c3d0c32e79bfbce168af43bff845ab42cc6c6f6dae50740f98d8fe1c8fd6b9ad4fc17e21d253ccbad326318192f162451f52b9c7e34ee8e8862294fe191834529041208208ea0d253360a28a2800a28a2800a28a2800a28a2800a28ad5f0e68371e23d661d3edcedddf349211c220ea7fcf7a052928abb1344f0fea5e21bbfb3e9f06f23efbb1c220f526bd6342f859a45846926a64dfdc8392092b18fa0eff8fe55d7691a459e87a6c56363108e241c9eee7bb13dc9abd59b9f63c4af8e9cdda1a22382de0b68c476f0c7120e8b1a851f90a928a2a0e10a82eecedafa0305ddbc53c27aa4a8187e46a7a281a76d51c6dd7c30f0cdcb1296f3dbfb4531c7fe3d9a813e13f8715b25ef9c7a34c3fa2d773453e666cb13597da661e97e0ed0347904969a6c4251d24932ec3e85b38fc2b728a295cca53949de4ee1451450498dabf85745d714fdbac22693b4a836b8ff00810feb5e61e26f85f7da6092eb4966bdb6073e563f7a83ff0066fc3f2af68a2a949a3a68e2aa52d9e9d8f95c820904608ed457adfc47f0424d0cdaf69b1aa4a80c97718fe31d4b8f7f5f6e7ebe495a2773dba35a35a3cd10a28a299b0514514005145140057b7fc2ed0ffb37c3a6fe55c4f7c7772395404851f8f27f115e251c6d2c8b1a0cbb90aa3d49afa7eced52caca0b58fee431ac6bf40315137a1e766351a8282ebfa13d1451599e305145140051451400514514005145140051451400514514008caaea55806523041190457ce9e2ed18e83e26bcb203f75bbcc88f3f71b91f974fc2be8caf26f8c36256ef4dd4001874685bea0e47f33f955c1ea77e5f371abcbdcf30a28a2b43db0a28a2800a28a28035fc2b6e2ebc57a54246435d2123d81c9fe55f48d7cf9e004dfe39d2c633fbc63f9231afa0eb399e3664ff00789790514515079c14514500145145001451450014514500145145001451450015c1fc5a8bccf0942f8e63bb439f62ac3fa8aef2b90f8991ac9e07bb27f81e361f5dc3fc69c7737c33b568fa9e0d451456c7d185145140051451401d5fc36527c7ba711d84a4ff00dfa6af7daf08f86007fc2716dff5ca4c7fdf26bddeb39ee78b997f157a7eac28a28a83cf0a28a2800a28a2800a28a2800a28a2800a28a2800a28a2800ae5fe22a96f01ea78ce408cff00e445aea2b9cf1eaab781f550c703ca07f10c314e3ba35a1fc58faa3e7aa28a2b63e9428a28a0028a28a00b1637b71a6df437969218e785b7230ec6bddbc25e39b0f12c0b148c96da88003c0cd8de7d533d47b751fad780d2ab1560ca48607208ea2935739f11868d65aefdcfa9e8af12d0be296afa6a2c3a828d4211d19ced907fc0bbfe22bd0b4bf88de1bd4c286bcfb24a7aa5c8d98ff817ddfd6b37168f1eae0ead3e975e47574536391268d6489d5d1b90ca720fe34ea939428a28a0028a28a0028a28a0028a28a0028acdd4f5fd2747526fefe08180cec671bcfd17ad711ad7c5cb38331e8f68d72fff003d67f9507d00e4fe94d45b36a742a54f851e8577796d616cf73773c70c2832ceed802bc5fc75e3c7f1031d3ec3747a7236598fde988e84fa2fa0fc4fb735ad788b54f105cf9da8dcb4983958c7089f41fe4d65d68a291eae1b04a9be69eac28a28aa3bc28a28a0028a28a0028a28a0028a28a009edef6eed0e6daea684fac7215fe55bf67f103c4f649b13549245ff00a6cab21fcc8cfeb45146e44e9c24bde57372c7e28f881c379896526dfef4446783e8c3d2baed17c65a8ea3222cd0daa86ebb1587afab7b51454c92b1e4568455ec8eb2caee4b9cef0a3e5078156a462913b0ea149a28a897c470bf88c5d5759b8b18e468922254903703ebf5ae22f7e24eb304b24696f638070098df3d0ffb5451556563a694537aafeb439ebaf8a1e269199639ede1c1c663801ffd0b358179e26d7350ddf6ad5af2456ea9e690bff7c8e28a2aec91eb50a5051bd91964924924927a934945141d21451450014514500145145007ffd9),
(2, 'aarti', 'Female', 4878787, 'Item 3', 'ulhasnagar', 0xffd8ffdb004300080606070605080707070909080a0c140d0c0b0b0c1912130f141d1a1f1e1d1a1c1c20242e2720222c231c1c2837292c30313434341f27393d38323c2e333432ffdb0043010909090c0b0c180d0d1832211c213232323232323232323232323232323232323232323232323232323232323232323232323232323232323232323232323232ffc0001408006a00b404012200021101031101042200ffc4001f0000010501010101010100000000000000000102030405060708090a0bffc400b5100002010303020403050504040000017d01020300041105122131410613516107227114328191a1082342b1c11552d1f02433627282090a161718191a25262728292a3435363738393a434445464748494a535455565758595a636465666768696a737475767778797a838485868788898a92939495969798999aa2a3a4a5a6a7a8a9aab2b3b4b5b6b7b8b9bac2c3c4c5c6c7c8c9cad2d3d4d5d6d7d8d9dae1e2e3e4e5e6e7e8e9eaf1f2f3f4f5f6f7f8f9faffc4001f0100030101010101010101010000000000000102030405060708090a0bffc400b51100020102040403040705040400010277000102031104052131061241510761711322328108144291a1b1c109233352f0156272d10a162434e125f11718191a262728292a35363738393a434445464748494a535455565758595a636465666768696a737475767778797a82838485868788898a92939495969798999aa2a3a4a5a6a7a8a9aab2b3b4b5b6b7b8b9bac2c3c4c5c6c7c8c9cad2d3d4d5d6d7d8d9dae2e3e4e5e6e7e8e9eaf2f3f4f5f6f7f8f9faffda000e040100021103110400003f00f9fe8a28a00f9fe8a28a2ad69d64fa8ea56f671eeccd204255776d1ddb1ec327f0aab5d1f81a2f33c556cde622f968ed866c16f948c2fa9e73f406b1c45474e94a6ba260153d95a4b7f7f6f6702ee9ae2558907ab31c0fd4d415db7c22b38afbe2ae8114d8dab334a33fde44675fd545747e21f174da06a4ba6e9d05a3450c4a18488f943d9460818dbb7f3ac9f1921bfd3748d7015633c02298a30d8adf7b0075ce4b8fc2bd026d274db999a69f4fb59656fbcf242ac4fd49159de24d36c5bc29770110dac30c6658b6c6b8571c800640058fcb9ff68f07a1f9cc362a8c274f96367d5f7b928e8bc65e3ed73c1fe2497c33e1bbf8edf4cd2a28ed117ecb13967541bd89652725b39ac2f88864d5acfc37e2a72aefaad87977322a85dd710b147380001c6dafa76ebe1cf83afaee6bbbaf0ed8cd713bb492c8f1e4bb13924fb935c1fc69f0a68ba5fc2965d3ace0b24b3bd49a28e318059fe4603ea0e7fe035e41451457d4947cc74514514515dff81fc328634d5efa262f9cdb46e3803fbf8fe5f4cf390473e27130c3d37397fc38051457b1fc15f85d0789a43e21d721dfa5c0fb6de061c5c38ea4faa0f4ee78ec41c0b2f05eb97923abd9b5a6c62ac6ec18c861db691bbf4af43b4f0d6989a5c16d75a759c92ac2a92b888659b18277601ebdf835b3457cbe2731ad5ed7d2dd896ce07c3df0ff00c55e298bced2346b89a0ce3cf6c4719fa33100fe15ef09f043423f0f3cb7d1117c4dfd9f8327daa423ed3b3fdedbf7bdb15ec11c690c6b1c48a91a0daaaa3000f4029d5e25a8e89a9693b7edd69244add1f865279e370c8cf078eb542bdea48d268da39515d181565619041ec4579578bbc34343ba49edb71b29c9da0827cb3fdd27f977e0fa64fb581ccd5797b3a8ad2fc18ee7c23ac683ab787eefecbabe9d736537659a32bb87a83d08f7159d5f76ebba0697e25d2a5d3756b48ee6da41d1872a7d54f507dc57c89f123c0177e01f107d9599a6d3ee32f697047de5eea7fda1c67f03deb9aa28a2bd619c6d145145779a1ca3c39e069b5884c4d7573200ab2e7070fb76e01e78dedc63afb57075ecfa5da5b5e786f4c8eeade29d05b44c16540c01d839c1fad7979ad550845495d37af9a5d04c2bd37c377173e08f85775e2ab2748756d56f96cad2568d5ca429967203023923078ec2bccabeb7f017863c3fe21f853e198f51d3adafa286dd9904ab90aecc77fe39cd60693ab5c78cf48d5ac6ee3b249046a2144665258ee21882c4901957240c0c8cf502bcdebdcadb4db0b390c96b656d0391b4b4512a923d320579278a2ca1b0f12dedbc036c41c32ae000bb9436063b0ce07b5639662213ab3853564ecd2fc1fe8099e35a4f8a35cf887a0f89343d6af12ea68f4f37b6405bc7191244eacc06c51925770af2dafb734ef01785348be4bdd3f41b2b6b98c10b24698201041fcc122be39f145843a578b357d3ed98182daf258a320e7e557207e9591451457b433268a28a28a28a0028a28aefbfe15a7fd45fff0025bffb3ae4b5dd31346d626b049cce2209fbc29b324a063c64f4248ebce33c74af59f0fdd0bdf0fd84e24690985559db392c061b39f706b88f88b65e56ab6b78a230b3c450851f31653c93c7a328fc3e95e0e071b5e58974ab4afbf45baf97a8933d974cfd9eb53d574ab3d421d7ec44575024c80c4f9019411fcebcab5cd267d075dbfd26e483359cef0b301c36d38c8f63d7f1afadfe106a4353f859a1c85b2f0c4d6ededb18a8fd00af06f8f5a57f677c4eb8b855c25f5bc7703eb8d87f54fd6b8cab5a75fcfa5dfc37b6c544b11c8dc320f1820fd4122aad15eeca2a49a7b319e6356b4ed42eb49d4adf50b199a1bab79049148bd55874aab457b0f873c490f886194a5bbc32c3b7cc52415e738c1efd3d05703e23f16dd6b9bada35f22c43e420fbce3b6f3fae071f5c035b7e0bb7d474cd3358b83653a4ad6f1cb6c24898097e5765dbfde072bd3ae47ad7137561796410ddda4f007cedf3632bbb18ce3239ea3f3af1f0786a11c4cf96da5adaf95d88fa9be1ff00c6297c53a36b12ea1a5a4573a45935dcaf0c9f24c14138008f94f1ea6bc33c7bf12b5af1edd28bc2b6da7c4dba1b3889daa7fbcc7f89bdff00202b57e1abcf0784bc792c3148ccfa508976a9392cdb78fcebcea48a485f64b1b237a30c1aaf451457b2319451454d6b6ef797905b46543cd22c6a5ba649c0cfe75ee91c69146b1c68a88802aaa8c0007402b8fd0bc17a6fd9f4dd4fcebaf3f6c571b77aeddd80d8c6dce33ef5d957cb66b8a85794630e9725b1c88d23aa28cb31000f535f74786b4687c3de1ad3b48800096902c648fe2603e66fc4e4fe35f3ff0086fe09e9fa9e89a56b3ff099c36b35c4115cf926d91bcb6203639906707dabd47fb2fc57ff00455ad7ff000536dffc5514514579423d128af3bfecbf15ff00d156b5ff00c14db7ff001547f65f8aff00e8ab5aff00e0a6dbff008aa2b27c4f0bdcf85b52856531830ef6c7f10421f07ea547f3ad6a86eed92f2ce7b590b049a368d8a9e4023071f9d5d2972548cbb34c0f44af36f8e7a345aa7c32bdb82a0cda7c897111ee3e60ac3fef963f90a97fb2fc57ff00455ad7ff000536dffc5552d5bc2dafeb9a55ce99a87c51b696d2e5364b1ff665baee1f50c08af09a2bd1352f01e9567a5dddd473de17861791433ae090a48cfcbed5e775f6586c553c426e9f42cf9468af65f10fc0fd3344f0eea3aa45e3186e5ed2dde65805ba8321519db9f30f5fa578d515dc7843c5c2d96d346b8b55f2f708e1922cee2cce4e5f2718f9bb63007439cd70f5abe1db4b9b8d72ca486de59522b989a46442c106e1c923a743f952c652a7568b55365afcc02bd3be197c5cd43c171ae8f3da8bed2e49729197daf0b31e4a9e783d707bfa735e6356b4d8a49751b658e3673e6af0a33dc57a0789fc5cde1fba86da0b449e7641293313b00dd8c100827383dc638af2c9247964692476776259998e4927a926bb2f1f5b5cdd6b42682cef1a182d82cb2980ecce59890c3390011c9c7391db278bac32ca54e1414a2b57b891f42fc64f8b1ab78735397c35a2c6b6d29855e5bdce5c061d107f09f7e7db1d6be71666762ccc5989c924e4935e83f1a7ed33fc50d627782510a18e247287690235e87eb9af3da2badd0fc0edace9515fb6a0b0894b6d4111738048e4e473907d7b57255ed9a1d97f67687656a63f2dd221bd77670e796e7ea4d4e698a9d0a71f66ecdbfc3fab030af44f007c24d4bc7da3dc6a76da85bd9c30ce600254662e4282718ff78579dd7d8df07f49fec8f85fa34657125c466e5fdfcc2587fe3a57f2ae47fe15a7fd45bff25bff00b3a2b63c45e2f5d03504b4361f68dd1093779db31924631b4fa7eb457053a99a548a9c767fe10d4f13d4fe055e69572b05c788ac43b2071fbb6e9923fa51567e3a789ee63f88cf67693155b4b48a2700ff0011cbff00271453fc0b7114de15b78e3dfba0778e4dca00ddb8b71cf230cbcf1ce78e326a7c43b2f3f438ae962dcf6f28cbe7eea37078cf396d9eff00ad67fc369ffe4236ed2ff71d232df50c40ff00be413f4ae9fc536df6bf0c6a11efd9b62326719fb87763f1db8fc6b0a9fb8cc6fe7f9eff00989ee76bfb386a3e7f83f53d3cb64db5ef9807a2ba8feaa6b37f694d28359685abaaf292496d237a860197ff00416fceb0ff0066fd4fc8f15eada631c0bab4128f768db1fc9cfe55ea5f1b749fed5f85da932ae64b364ba4ff0080b61bff001d2d583e0ab3d0ef3448d1edece7be059a65950338f9b00e0f6c15e9c64fae6ba9834ad3ada659adf4fb58a55fbaf1c2aac3b7502bc3e8af4abe572ab372551a4fa7f4c763c9fe10d97c34bad2663e277b5fed7129f96fe5d91f97818d9c853df39e7f0af53b6d3be0fda5cadc43ff0008b8957a169e2603f0248af9228af7ca8e7b786e6168ae228e589baa48a181fc0d783d15ceb246b5553f0ff82163edd8bc65e0f82311c3e21d16341d152ee3007e00d50d5b57f875aeaaaeada8786efb67dd371342e57e849e2be31a2bdb3fb0b48ffa0558ff00e03a7f851fd85a47fd02ac7ff01d3fc2bc4e8ad3fb22a7fcfd7f77fc10b1f58c9a1fc1a90e5878687fbb768bfc9aa03e19f82cdd4f87ff000d431ffb3d7cab457b67f61691ff0040ab1ffc074ff0a3fb0b48ff00a0558ffe03a7f8550f057fc8a363ff006d3ff46356fd789565529d494399e8dafb847d77a7fc32f861ac5bb5c69ba5585e42adb0c96f76eea1bae321faf22adffc29df007fd0b90ffdff0097ff008aae67f673ff00927f7dff006127ff00d171d7afd67ff61691ff0040ab1ffc074ff0a3fb0b48ff00a0558ffe03a7f85685159fb5a9fccfef11c37fc29df007fd0b90ff00dfe97ff8aa70f83fe011ff0032e5bffdfd93ff008aaede8acffec2d23fe81563ff0080e9fe147f61691ff40ab1ff00c074ff000ad0a28f6b53f99fde07143e1178087fccb76dff007dbfff00154e1f09bc063fe65ab4fcdffc6bb3a2b3ff00b0b48ffa0558ff00e03a7f851fd87a3ffd02ac7ff01d3fc2b91f897ff30bff00b6bffb257035ebe172fa95e92abed1abff009fa9563cf350f057c2bd1e758352b0d12ce575dea97138462b9c6402dd383557fe11af838fd17c39f85f28ff00d9ebcc7f68ff00f91e74dffb06affe8c92bc6ebdb3fb0b48ff00a0558ffe03a7f855e4448a358e35544401555460003a002bc168ada5934a5f155bfcbfe0858fad23f07fc200e1d22d0091eb7c187e5bf15d569fa8f83b498043a6dee856910e896f34483f435f10d15ef959f3e95a3fef2e2e2c2c7bbc92490a7d49248fd6bc4e8a2392b8bd2a7e1ff042c7dc971e24f0bcd0b4573ad68ef130c32497511047b826b88d4f45f82f3cad35d9f0e231e4f9178b18fc9180af94a8aee3c4761a35feb5a3dbe942dcf9f218e7fb115385caf385e0601639c76f6af44af28f025b3cfe2986452a0411bc8d9ee31b78fc5857abd70e66bd9ca146f7e55f9b133bff00883a5784e6f19e9da7f81a48e4b6b9448dfcb91dd44cce46016f6dbd2beb9b2b48ac2c6dece01886de258907a2a8c0fd057c83f07b49fed7f8a3a3465731dbc8d74fedb14b0ffc7b68fc6beb7d6b504d2742d43517fb9696d24e7fe02a4ff4af1ef174f1dc78aafde36dca1c2138c72aa14fea0d15957772f79793dd48143cd2348c17a024e4e3f3a2be9e8c3929c61d92451f1878f752fed6f1f6bd7bbb72c97b2043fecab6d5fd00a2b9f77692467739662493ea68adff0002dea5a789a347da16e236877336307823eb92a063debd5ebc334db94b3d52d2ea40c521992460bd480c0f1f957b9d7cf6754ed5633eebf2133b3f849aa8d23e27e893336d49a6fb337bf980a0fd48afaf35ad3d756d0eff004e7c6dbab792139ff6948feb5f0a5a5c49677905cc47124322c8a47620e47f2afbcac6e92fac2daee3fb93c4b2afd18023f9d7855f5b7d8b50b9b5dfbfc895a3dd8c67692338fc2a0ae8bc6f67f64f13cec1515275595420c751839f72413f8d73b5f4142a7b4a519f7433e0992378a578e452ae8c5594f50475a6d75bf13b4d4d2be25ebf6b18c21ba69547a0701fff0066ae4a8a28a2b500a28a28a28a2800a28a2bd77c15ff00228d8ffdb4ff00d18d5bf581e0aff9146c7feda7fe8c6adfaf88c5ff00bc4fd5fe649f507ece7ff24fefbfec24ff00fa2e3af5faf20fd9cffe49fdf7fd849fff0045c75ebf451451580828a28a28a28a0028a28ae07e25ff00cc2ffedaff00ec95c0d77df12ffe617ff6d7ff0064ae06bebb2bff007487cff36523e64fda3ffe479d37fec1abff00a324af1baf64fda3ff00e479d37fec1abffa324af1ba28a28af406145145145145001451457a1fc36b675b3bfba2576492246077054127f0f98574de21bd3a7f87afae4348aeb115468ce1959be5520f6c120d66f812d920f0b43229626791e46cf620ede3f05151fc40b9960f0d7951b285b89d239015072a32dc67a72abc8c1edd09af94aabdb6616fef5beeff008626d7d19ee1fb36699e6f8835ad50af16f6c9029f776cff0024fd6bd47e346a7fd99f0b35721b0f7212d97df730cffe3bbab9ff00d9db4f16de00babc23e7bbbe739f5555551faeeacbfda535331e89a2694adfebee1ee187fb8bb47fe866bcb28a28afab28f9ca8a28a2bdc3499e4b9d1ec6799b74b2dbc6eed8c6495049af0faf6cd0bfe45fd37febd62ffd0057879daf720fcc4c2bed5f86978d7df0d3c3b331c91651c64ffb8367fecb5f1557d93f08bfe494e81ff5c1bff436a926d5b4eb699a19f50b58a55fbc8f32a91dfa134cfeddd23fe82b65ff008109fe35e63e34ff0091bafbfed9ff00e8b5ac0ace8e4f0a94e33727aa4c562a6b1aefc2c6d5ee86b12e8326a28e639cdc40ad2065e30495ed8c7e154bfb6fe0d7af86bff0153ff89af9c3c7ff00f250fc47ff006129ff00f4335ced7b6ff6ee91ff00415b2ffc084ff1a9edafed2f777d92ee09f6637795206db9e99c7d0d785d77df0d3aea9ff6cbff0067acf1795c285175149bb7f98347d63fdb7f06bd7c35ff0080a9ff00c4d696890fc30f11dd496ba3d8f87ef678d3cc748ad1090b9033f77d48af8f2bd97f66ff00f91df54ffb06b7fe8c8eaffc45ff00917edffebe97ff00407af32af4df88bff22fdbff00d7d2ff00e80f5e655e8e51feecbd58d1a3fb42e83a468d65a0b697a5d9d919649839b78163dd8098ce073d6bc26be87fda5ffe3c3c3bff005d67fe495f3c57aef82bfe451b1ffb69ff00a31ab7eb03c15ff228d8ff00db4ffd18d5bf5f378bff00789fabfcc47d41fb39ff00c93fbeff00b093ff00e8b8ebd7ebc83f673ff927f7dff6127ffd171d7afd1451456020a28a28a28a2800a28a2b81f897ff0030bffb6bff00b25727e1e768fc4ba53a31575bc84ab03820ef1cd759f12ffe617ff6d7ff0064ae4741ff0091874cff00afb8bff4315f5581ff00705e8ff36523e64fda3ffe479d37fec1abff00a324af1c5fbc3eb5ec7fb47ffc8f3a6ffd8357ff0046495e38bf7c7d6bdb33543fb7748ffa0ad97fe0427f8d5faf03af1b2fc0c715cdcced6b7e371247db4fe0df07dbdab4f378774748e342eec6ce3c000649e95caff6dfc1af5f0d7fe02a7ff135dd6bdff22aea7ff5e52ffe806be14af6dfeddd23fe82b65ff8109fe347f6ee91ff00415b2ffc084ff1af12a2bd2fec4a7fcec763eb1fedbf835ebe1aff00c054ff00e268fedbf835ebe1affc054ffe26be4ea2bddadaeedaf23325adc453a03b4b44e1803e991f5ae0fe24cf1b5ce9f6e1bf7a88eec31d031007fe827f2ad3f875ff0022fdc7fd7d37fe809581f117fe46083febd57ff437ae4c15054f1fc89fc37fc84b73ee3f0b6a3e1cd434a6ff00845e4b36b08642856cd02a2bf048c0039e41fc6bc03f68fbb3278df4db5cfcb0e9e1f1e85a47cfe8a2bb6fd9bffe448d53fec24dff00a2e3af39fda098b7c4d23fbb6510fd58ff005ae468a28afa628f2ba28a28af6cd0bfe45fd37febd62ffd005789d7b6685ff22fe9bff5eb17fe802bc4ceff00870f5130afb27e117fc929d03feb837fe86d5f1b57d93f08bfe494e81ff5c1bff436af32f1a7fc8dd7dff6cfff0045ad6056ff008d3fe46ebeff00b67ffa2d6b02bd3c27fbbc3d17e4347cb1e3ff00f9287e23ff00b094ff00fa19ae76ba2f1fff00c943f11ffd84a7ff00d0cd73b4577df0d3aea9ff006cbff67ae06bbef869d754ff00b65ffb3d73e69fee93f97e684c2bd97f66ff00f91df54ffb06b7fe8c8ebc6abd97f66fff0091df54ff00b06b7fe8c8eaff00c45ff917edff00ebe97ff407af32af4df88bff0022fdbffd7d2ffe80f5e6551947fbb2f5608e8bf697ff008f0f0eff00d759ff009257cf15f43fed2fff001e1e1dff00aeb3ff0024af9e2bd77c15ff00228d8ffdb4ff00d18d5bf581e0aff9146c7feda7fe8c6adfaf9bc5ff00bc4fd5fe623ea0fd9cff00e49fdf7fd849ff00f45c75ebf5e41fb39ffc93fbeffb093ffe8b8ebd7e8a28a2b01051451451451400514515c0fc4bff00985ffdb5ff00d92b91d07fe461d33febee2ffd0c575df12ffe617ff6d7ff0064ae4741ff0091874cff00afb8bff4315f5581ff00705e8ff36523e64fda3ffe479d37fec1abff00a324af1c5fbe3eb5ec7fb47ffc8f3a6ffd8357ff0046495e38bf7c7d6bdb2bc0ebdf2bc0eb9323ff00979f2fd411f756bdff0022aea7ff005e52ff00e806be14afbaf5eff915753ffaf297ff004035f0a51451457be30a28a2bd37e1d7fc8bf71ff5f4dffa025607c45ff91860ff00af55ff00d0deb7fe1d7fc8bf71ff005f4dff00a025607c45ff0091820ffaf55ffd0debc0c3ff00c8ca5f31753e9afd9bff00e448d53fec24dffa2e3af36f8fff00f253e4ff00af387fad7a4fecdfff002246a9ff006126ff00d171d79bfed01ff253e4ff00af387fad723451457be33cb68a28a2bdb342ff00917f4dff00af58bff4015e275ed9a1ff00c8bfa6ff00d7ac5ffa00af133bfe1c3d44c2bec9f845ff0024a740ff00ae0dff00a1b57c6d5f4bfc39bdbb8be1fe8e91dd4c8a226c2ac8401f3b579978d3fe46ebeffb67ff00a2d6b02b7fc6bff2375f7fdb3ffd16b5815e9e13fdde1e8bf21a3c2bc7ff00f250fc47ff006129ff00f4335ced6d78bd99fc65ad33b16637b29249c93f39ac5a2bbef869d754ff00b65ffb3d7035defc35eba9ff00db2ffd9eb9f34ff749fcbf342615ecbfb37ffc8efaa7fd835bff0046475e355e99f04a7960f155fb432bc6c6c88251883f7d3d2b43e22ffc8bf6ff00f5f4bffa03d79957a6fc45ff00917a0ffafa5ffd01ebccaa328ff765eac11ddfed2fff001e1e1dff00aeb3ff0024af9e2bd97e395ccf3da68a269a493124b8dee4e385f5af1aaf5df057fc8a363ff6d3ff0046356fd60782ff00e451b1ff00b69ffa31ab7abe6f17fef13f57f988fa83f673ff00927f7dff006127ff00d171d7afd7cf1f056eae20f07dd2c3712c6a6f58e11c819d89e95e91fda37bff003f971ff7f5bfc6968a4a2b003bfa2b80fed1bdff009fcb8ffbfadfe347f68deffcfe5c7fdfd6ff001a5a2928a00efe8ae03fb46f7fe7f2e3fefeb7f8d1fda37bff003f971ff7f5bfc6b82f897ff30bff00b6bffb25723a0ffc8c3a67fd7dc5ff00a18aeb7e257fcc2ffedaff00ec95c8e87ff21fd37febea2ffd0857d5e07fdc17a3fcd8d6c791fed1ff00f23ce9bff60d5ffd192578e2fdf1f5af4af8d93cb3f8aec5a695e46164002ec49fbefeb5e6abf787d6bdb6bc0ebdeebc12b8f23ff979f2fd411f756bdff22aea7ff5e52ffe806be14afac756bfbc3e1fbe06ee720dac808321fee1f7af93a8a28a2bdf18514515e9bf0ebfe45fb8ff00afa6ff00d012b03e22ff00c8c16fff005eabff00a1bd6ffc3aff00917ee3febe9bff00404ac0f88bff0023041ff5eabffa1bd78187ff009194be62ea7d35fb37ff00c891aa7fd849bff45c75e6ff00b407fc94e7ff00af387fad745f04aeae20f0b5fac33cb1a9bd24847207dc4f4ae27e30cb24de3b67964791becd18cb3127bd723451457be3381a28a2bfffd9);

-- --------------------------------------------------------

--
-- Table structure for table `foodcategory`
--

CREATE TABLE `foodcategory` (
  `cat_id` int(11) NOT NULL,
  `cat_name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `foodcategory`
--

INSERT INTO `foodcategory` (`cat_id`, `cat_name`) VALUES
(1, 'Starters'),
(2, 'South-Indian'),
(3, 'Punjabi'),
(4, 'Chinese'),
(5, 'Icecream'),
(6, 'Juice');

-- --------------------------------------------------------

--
-- Table structure for table `fooditems`
--

CREATE TABLE `fooditems` (
  `foodid` int(11) NOT NULL,
  `foodname` varchar(255) NOT NULL,
  `foodcategory` int(11) NOT NULL,
  `foodprice` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `fooditems`
--

INSERT INTO `fooditems` (`foodid`, `foodname`, `foodcategory`, `foodprice`) VALUES
(1, 'Panner tikka', 1, 100),
(5, 'Garlic bread', 1, 110),
(7, 'French Fries', 1, 80),
(8, 'Spring roll', 1, 100),
(11, 'Chilly paneer', 1, 130),
(12, 'Chilly mushroom', 1, 130),
(13, 'Idli', 2, 50),
(14, 'Medu Vada', 2, 60),
(15, 'Sada dosa', 2, 50),
(16, 'asala dosa', 2, 80),
(17, 'Uttapa', 2, 70),
(18, 'Upma', 2, 80),
(19, 'Dry Manchurian', 4, 100),
(20, 'Gravy Manchurian', 4, 120),
(21, 'Schezwan rice', 4, 80),
(22, 'Noodles', 4, 80),
(23, 'Fried rice', 4, 90);

-- --------------------------------------------------------

--
-- Table structure for table `foodtobemade`
--

CREATE TABLE `foodtobemade` (
  `foodname` varchar(255) NOT NULL,
  `quantity` int(11) NOT NULL,
  `tableno` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `foodtobemade`
--

INSERT INTO `foodtobemade` (`foodname`, `quantity`, `tableno`) VALUES
('Spring Roll', 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `readyorders`
--

CREATE TABLE `readyorders` (
  `foodname` varchar(255) NOT NULL,
  `quantity` int(11) NOT NULL,
  `tableno` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `userid` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `post` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`userid`, `name`, `username`, `password`, `post`) VALUES
(1, 'Nikhil Nagdev', 'manager', 'manager', 'Manager'),
(2, 'Nikhil', 'chef', 'chef', 'chef');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cheftable`
--
ALTER TABLE `cheftable`
  ADD PRIMARY KEY (`chefid`);

--
-- Indexes for table `foodcategory`
--
ALTER TABLE `foodcategory`
  ADD PRIMARY KEY (`cat_id`);

--
-- Indexes for table `fooditems`
--
ALTER TABLE `fooditems`
  ADD PRIMARY KEY (`foodid`),
  ADD KEY `foodcategory` (`foodcategory`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`userid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cheftable`
--
ALTER TABLE `cheftable`
  MODIFY `chefid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `foodcategory`
--
ALTER TABLE `foodcategory`
  MODIFY `cat_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `fooditems`
--
ALTER TABLE `fooditems`
  MODIFY `foodid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `userid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `fooditems`
--
ALTER TABLE `fooditems`
  ADD CONSTRAINT `fooditems_ibfk_1` FOREIGN KEY (`foodcategory`) REFERENCES `foodcategory` (`cat_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
